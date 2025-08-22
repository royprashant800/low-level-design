package LLD.strategyPattern.withStrategyPattern.Strategy;

public class SportsDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
