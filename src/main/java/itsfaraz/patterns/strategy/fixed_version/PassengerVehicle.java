package itsfaraz.patterns.strategy.fixed_version;

import itsfaraz.patterns.strategy.fixed_version.strategy.VehicleStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
}
