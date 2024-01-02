package itsfaraz.patterns.strategy.fixed_version.strategy;

public class SpecialLogic implements VehicleStrategy{
    @Override
    public void drive() {
        for (int idx = 1; idx <= 2; idx++){
            System.out.println("Special Vehicle Driving Logic "+idx);
        }
    }
}
