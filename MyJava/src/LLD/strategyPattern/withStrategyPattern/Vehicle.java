package LLD.strategyPattern.withStrategyPattern;

import LLD.strategyPattern.withStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        //some code
        driveStrategy.drive();
    }
}
