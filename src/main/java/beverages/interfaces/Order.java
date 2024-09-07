package beverages.interfaces;

import beverages.factorias.BeberageFactory;

import java.util.ArrayList;
import java.util.Collection;

public class Order {
    Collection<Beverage> beverages ;
    private BeberageFactory beberageFactory;

    public Order() {
        this.beverages = new ArrayList<>();
        this.beberageFactory = new BeberageFactory();

    }

    public void orderBeberage(Integer quantity, String type){
        for (int i = 0; i < quantity; i++) {
            this.beverages.add(this.beberageFactory.orderBeverage(type));
        }
    }
}
