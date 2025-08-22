package LLD.designVendingMachine.vendingStates.impl;

import LLD.designVendingMachine.Coin;
import LLD.designVendingMachine.Item;
import LLD.designVendingMachine.VendingMachine;
import LLD.designVendingMachine.vendingStates.State;

import java.util.List;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("cutrrently vending machine is in selection state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        //1. get item of this code number
        Item item = machine.getInventory().getItem(codeNumber);

        //2. total amount paid by user
        int paidByUser = 0;
        for(Coin coin : machine.getCoinList()) {
            paidByUser = paidByUser + coin.value;
        }

        //3. compare product price and amount paid by user
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient amount, product you selected is for the price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        } else if(paidByUser >= item.getPrice()) {
            if(paidByUser > item.getPrice()) {
                getChange(paidByUser -  item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        //actual logic will bw slightly different
        System.out.println("Returned the change in the coin dispense tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full money back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can not be updated in selection state");
    }
}
