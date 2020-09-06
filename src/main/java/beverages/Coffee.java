package beverages;

import beverages.interfaces.IBeverage;

public class Coffee implements IBeverage {
    @Override
    public double price() {
        return 1.2;
    }
}
