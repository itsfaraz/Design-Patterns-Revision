package itsfaraz.patterns.strategy.fixed_version;

import itsfaraz.patterns.strategy.fixed_version.strategy.VehicleStrategy;

public class SportVehicle extends Vehicle{
    public SportVehicle(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
}
