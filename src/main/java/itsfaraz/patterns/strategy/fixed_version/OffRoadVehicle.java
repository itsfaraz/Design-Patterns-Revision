package itsfaraz.patterns.strategy.fixed_version;

import itsfaraz.patterns.strategy.fixed_version.strategy.VehicleStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
}
