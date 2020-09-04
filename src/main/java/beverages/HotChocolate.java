package beverages;

public class HotChocolate implements Beverage {

    @Override
    public double getPrice() {
        return 1.45;
    }

    @Override
    public String serveBevereage() {
        return "Your hot chocolate";
    }
}
