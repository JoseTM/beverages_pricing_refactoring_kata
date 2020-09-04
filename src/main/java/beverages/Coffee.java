package beverages;

public class Coffee implements Beverage {

    @Override
    public double getPrice() {
        return 1.2;
    }

    @Override
    public String serveBevereage() {
        return "your Coffee";
    }
}
