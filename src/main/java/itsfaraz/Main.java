package itsfaraz;


import itsfaraz.patterns.observer.restaurant.Kitchen;
import itsfaraz.patterns.observer.restaurant.Waiter;
import itsfaraz.patterns.observer.restaurant.protocols.Observable;
import itsfaraz.patterns.observer.restaurant.protocols.Observer;
import itsfaraz.patterns.strategy.fixed_version.SportVehicle;
import itsfaraz.patterns.strategy.fixed_version.Vehicle;
import itsfaraz.patterns.strategy.fixed_version.strategy.SpecialLogic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Strategy Pattern
//        Vehicle vehicle = new SportVehicle(new SpecialLogic());
//        vehicle.drive();

        // Observable Pattern
        Observable observable = new Kitchen();
        Observer alphaWaiter = new Waiter(observable,"Tom");
        Observer betaWaiter = new Waiter(observable,"Tim");
        Observer gamaWaiter = new Waiter(observable,"Harry");
        observable.add(alphaWaiter);
        observable.add(betaWaiter);
        observable.add(gamaWaiter);
        observable.setData(true);


        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> {
            observable.setData(false);
            observable.remove(betaWaiter);
            observable.setData(true);
            scheduler.shutdown();
        }, 3, TimeUnit.SECONDS);

    }
}