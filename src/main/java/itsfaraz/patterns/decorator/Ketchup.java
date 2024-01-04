package itsfaraz.patterns.decorator;

import itsfaraz.patterns.decorator.protocols.BasePizza;
import itsfaraz.patterns.decorator.protocols.Toppings;

public class Ketchup extends Toppings {
    private BasePizza basePizza;
    public Ketchup(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 200;
    }
}
