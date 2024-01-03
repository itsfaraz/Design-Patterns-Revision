package itsfaraz.patterns.observer.restaurant;

public class Pair {
    private Integer intData;
    private String stringData;

    public Pair(Integer intData, String stringData) {
        this.intData = intData;
        this.stringData = stringData;
    }

    public Integer getIntData() {
        return intData;
    }

    public String getStringData() {
        return stringData;
    }
}
