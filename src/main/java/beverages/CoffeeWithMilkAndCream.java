package beverages;

public class CoffeeWithMilkAndCream extends BeveragesWith {
    @Override
    public double price() {
        Coffee coffee = new Coffee();

        return coffee.price() +  withMilk() + withCream();
    }
}
