package LLD.strategyPattern.withStrategyPattern;

import LLD.strategyPattern.withStrategyPattern.Strategy.NormalDrive;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDrive());
    }
}
