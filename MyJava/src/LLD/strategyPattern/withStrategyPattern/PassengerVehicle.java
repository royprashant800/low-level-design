package LLD.strategyPattern.withStrategyPattern;

import LLD.strategyPattern.withStrategyPattern.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDrive());
    }
}
