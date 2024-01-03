package itsfaraz.patterns.observer.restaurant.protocols;

public interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyUpdate();
    public void getData();
    public void setData(Boolean value);
}
