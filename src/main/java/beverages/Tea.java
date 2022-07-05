package beverages;

import beverages.interfaces.Beverage;

public class Tea implements Beverage {
    @Override
    public double price() {
        return 1.5;
    }
}
