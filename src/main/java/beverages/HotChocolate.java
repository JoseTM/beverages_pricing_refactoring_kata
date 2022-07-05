package beverages;

import beverages.interfaces.Beverage;

public class HotChocolate implements Beverage {
    @Override
    public double price() {
        return 1.45;
    }
}
