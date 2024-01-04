package itsfaraz.patterns.decorator;

import itsfaraz.patterns.decorator.protocols.BasePizza;
import itsfaraz.patterns.decorator.protocols.Toppings;

public class Cheese extends Toppings {
    BasePizza basePizza;
    public Cheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 40;
    }
}
