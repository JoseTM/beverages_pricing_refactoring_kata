package beverages;

import beverages.interfaces.Beverage;

public class Coffee implements Beverage {
    @Override
    public double price() {
        return 1.2;
    }
}
