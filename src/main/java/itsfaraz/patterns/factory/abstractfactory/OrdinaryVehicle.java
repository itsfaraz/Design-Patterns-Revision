package itsfaraz.patterns.factory.abstractfactory;

import itsfaraz.patterns.factory.abstractfactory.protocols.Vehicle;

public class OrdinaryVehicle implements Vehicle {
    @Override
    public void average() {
        System.out.println("Luxury Vehicle Average is 40");
    }
}
