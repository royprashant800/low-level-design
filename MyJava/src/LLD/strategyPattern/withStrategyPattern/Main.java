package LLD.strategyPattern.withStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();

        vehicle.drive();
    }
}
