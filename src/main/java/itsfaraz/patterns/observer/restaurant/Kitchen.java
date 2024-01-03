package itsfaraz.patterns.observer.restaurant;

import itsfaraz.patterns.observer.restaurant.protocols.Observable;
import itsfaraz.patterns.observer.restaurant.protocols.Observer;

import java.util.ArrayList;
import java.util.List;

public class Kitchen implements Observable {
    private List<Observer> observerList;

    public Kitchen(){
        observerList = new ArrayList<>();
    }
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyUpdate() {
        for (Observer observerObj :  observerList){
            observerObj.update();
        }
    }

    @Override
    public void setData(Boolean value){
        synchronized (this){
            if (value){
                notifyUpdate();
                System.out.println("----------------------------------------------------------");
            }
        }
    }

    @Override
    public void getData() {
    }

}
