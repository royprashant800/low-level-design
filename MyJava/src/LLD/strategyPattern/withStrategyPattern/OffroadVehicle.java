package LLD.strategyPattern.withStrategyPattern;

import LLD.strategyPattern.withStrategyPattern.Strategy.SportsDrive;

public class OffroadVehicle extends Vehicle {
    OffroadVehicle() {
        super(new SportsDrive());
    }
}
