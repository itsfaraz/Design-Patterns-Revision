package itsfaraz.patterns.decorator;

import itsfaraz.patterns.decorator.protocols.BasePizza;

public class Margerita extends BasePizza {
    @Override
    public int cost() {
        return 150;
    }
}
