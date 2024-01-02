package itsfaraz.patterns.strategy.problem_version;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() {
        super.drive();
        // Business Logic
        for (int idx = 1; idx <= 2; idx++){
            System.out.println("Special Vehicle Driving Logic "+idx);
        }
    }
}
