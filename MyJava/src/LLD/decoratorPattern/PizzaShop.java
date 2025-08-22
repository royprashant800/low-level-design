package LLD.decoratorPattern;

import LLD.decoratorPattern.base.Margherita;
import LLD.decoratorPattern.toppings.ExtraCheese;
import LLD.decoratorPattern.toppings.Mushroom;
import LLD.decoratorPattern.toppings.ToppingDecorator;

public class PizzaShop {
    public static void main(String[] args) {
        ToppingDecorator toppingDecorator = new ExtraCheese(new Mushroom(new Margherita()));

        int cost = toppingDecorator.cost();
        System.out.println(cost);
    }
}
