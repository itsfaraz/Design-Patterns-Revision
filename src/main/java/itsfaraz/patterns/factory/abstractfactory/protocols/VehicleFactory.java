package itsfaraz.patterns.factory.abstractfactory.protocols;

import itsfaraz.patterns.factory.abstractfactory.LuxuryVehicle;
import itsfaraz.patterns.factory.abstractfactory.OrdinaryVehicle;
import itsfaraz.patterns.factory.abstractfactory.VehicleType;

public abstract class VehicleFactory {
    public Vehicle getVehicle(VehicleType type){
        switch (type){
            case LUXURY:
                return new LuxuryVehicle();
            case ORDINARY:
                return new OrdinaryVehicle();
        }
        return new OrdinaryVehicle();
    }
}
