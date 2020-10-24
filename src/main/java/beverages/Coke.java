package beverages;

public class Coke extends FreshBeverage {

    @Override
    public String mark() {
        return "coke";
    }

    @Override
    public double price() {
        return 1.5;
    }
}
