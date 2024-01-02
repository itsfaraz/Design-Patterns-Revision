package itsfaraz.patterns.strategy.fixed_version.strategy;

public class NormalLogic implements VehicleStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Vehicle Driving Logic");
    }
}
