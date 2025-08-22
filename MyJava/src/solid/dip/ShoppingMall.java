package solid.dip;

public class ShoppingMall {
    BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doShopping(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
//        CreditCard creditCard = new CreditCard();

        BankCard bankCard = new CreditCard();

        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doShopping(1000);
    }
}
