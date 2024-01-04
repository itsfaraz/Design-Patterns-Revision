package itsfaraz;


import itsfaraz.patterns.factory.abstractfactory.FactoryType;
import itsfaraz.patterns.factory.abstractfactory.VehicleType;
import itsfaraz.patterns.factory.abstractfactory.protocols.FrameFactory;
import itsfaraz.patterns.factory.abstractfactory.protocols.LuxuryVehicleFactory;
import itsfaraz.patterns.factory.abstractfactory.protocols.Vehicle;
import itsfaraz.patterns.factory.abstractfactory.protocols.VehicleFactory;
import itsfaraz.patterns.factory.simple.shapes.Shape;
import itsfaraz.patterns.factory.simple.shapes.ShapeFactory;
import itsfaraz.patterns.factory.simple.shapes.ShapeType;

public class Main {
    public static void main(String[] args) {
        // Strategy Pattern
//        Vehicle vehicle = new SportVehicle(new SpecialLogic());
//        vehicle.drive();

        // Observable Pattern
//        Observable observable = new Kitchen();
//        Observer alphaWaiter = new Waiter(observable,"Tom");
//        Observer betaWaiter = new Waiter(observable,"Tim");
//        Observer gamaWaiter = new Waiter(observable,"Harry");
//        observable.add(alphaWaiter);
//        observable.add(betaWaiter);
//        observable.add(gamaWaiter);
//        observable.setData(true);
//
//
//        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        scheduler.schedule(() -> {
//            observable.setData(false);
//            observable.remove(betaWaiter);
//            observable.setData(true);
//            scheduler.shutdown();
//        }, 3, TimeUnit.SECONDS);

        // Decorator Pattern
//        BasePizza pizza = new Margerita();
//        Toppings ketchup = new Ketchup(pizza);
//        System.out.println(ketchup.cost());
//        Toppings cheese = new Cheese(ketchup);
//        System.out.println(cheese.cost());

        // Factory
//        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
//        circle.draw();

        // Abstract Factory
        VehicleFactory luxuryVehicleFactory = FrameFactory.getVehicleFactory(FactoryType.LUXURY_FACTORY);
        VehicleFactory ordinaryVehicleFactory = FrameFactory.getVehicleFactory(FactoryType.ORDINARY_FACTORY);

        Vehicle swift = ordinaryVehicleFactory.getVehicle(VehicleType.ORDINARY);
        Vehicle bmw = luxuryVehicleFactory.getVehicle(VehicleType.LUXURY);

    }
}