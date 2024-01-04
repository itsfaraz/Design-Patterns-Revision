package itsfaraz.patterns.factory.abstractfactory.protocols;

import itsfaraz.patterns.factory.abstractfactory.FactoryType;

public abstract class FrameFactory {
    public static VehicleFactory getVehicleFactory(FactoryType factoryType){
        switch (factoryType){
            case LUXURY_FACTORY:
                return new LuxuryVehicleFactory();
            case ORDINARY_FACTORY:
                return new OrdinaryVehicleFactory();
        }
        return new OrdinaryVehicleFactory();
    }
}
