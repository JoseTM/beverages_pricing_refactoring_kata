package beverages;

public class Tea implements Beverage {

    @Override
    public double getPrice() {
        return 1.5;
    }

    @Override
    public String serveBevereage() {
        return "Your tea";
    }
}
