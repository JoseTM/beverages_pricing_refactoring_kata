package beverages;

import beverages.interfaces.IBeverage;

public class HotChocolate implements IBeverage {
    @Override
    public double price() {
        return 1.45;
    }
}
