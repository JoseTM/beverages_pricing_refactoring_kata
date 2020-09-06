package beverages;

import beverages.interfaces.IBeverage;

public class Tea implements IBeverage {
    @Override
    public double price() {
        return 1.5;
    }
}
