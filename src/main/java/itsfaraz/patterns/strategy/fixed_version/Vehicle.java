package itsfaraz.patterns.strategy.fixed_version;

import itsfaraz.patterns.strategy.fixed_version.strategy.VehicleStrategy;

public class Vehicle {
    private VehicleStrategy vehicleStrategy;
    public Vehicle(VehicleStrategy vehicleStrategy){
        this.vehicleStrategy = vehicleStrategy;
    }

}
