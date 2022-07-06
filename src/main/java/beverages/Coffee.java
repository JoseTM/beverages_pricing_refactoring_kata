package beverages;

import beverages.interfaces.Beverage;

public class Coffee implements Beverage {

    boolean isMilked = false;
    @Override
    public double price() {
        return 1.2;
    }

    @Override
    public String getType() {
        return "cofee";
    }

    public void withMilk( ){
        isMilked = true;
    };

    public boolean isMilked() {
        return isMilked;
    }

}
