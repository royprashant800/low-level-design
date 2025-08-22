package LLD.strategyPattern.withStrategyPattern;

import LLD.strategyPattern.withStrategyPattern.Strategy.SportsDrive;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDrive());
    }

}
