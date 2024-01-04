package itsfaraz.patterns.decorator;

import itsfaraz.patterns.decorator.protocols.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
