package itsfaraz;


import itsfaraz.patterns.strategy.fixed_version.SportVehicle;
import itsfaraz.patterns.strategy.fixed_version.Vehicle;
import itsfaraz.patterns.strategy.fixed_version.strategy.SpecialLogic;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle(new SpecialLogic());
    }
}