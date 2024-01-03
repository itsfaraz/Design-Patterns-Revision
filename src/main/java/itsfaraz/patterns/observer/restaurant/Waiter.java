package itsfaraz.patterns.observer.restaurant;

import itsfaraz.patterns.observer.restaurant.protocols.Observable;
import itsfaraz.patterns.observer.restaurant.protocols.Observer;

public class Waiter implements Observer {
    Observable observable;
    private String name;
    public Waiter(Observable observable,String name){
        this.observable = observable;
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println("Got cooked food update from kitchen to "+name);
    }
}
