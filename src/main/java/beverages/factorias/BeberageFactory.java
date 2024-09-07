package beverages.factorias;

import beverages.interfaces.Beverage;
import beverages.Waiter;

public class BeberageFactory {


    public Beverage orderBeverage(String type){
        switch (type){
            case "tea":
                return Waiter.tea().make();
            case "Coffee":
                return Waiter.coffee().make();
            default:
                return Waiter.coffee().make();
        }
    }





    public Beverage createBeverage(){
        return Waiter.tea().make();
    }


    public Beverage createWithMilk() {
        return Waiter.tea().withMilk().make();
    }


    public Beverage createWithCinammon() {
        return Waiter.tea().withCinammon().make();
    }


    public Beverage createWithCream() {
        return null;
    }


}
