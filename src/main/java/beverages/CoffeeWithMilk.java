package beverages;

public class CoffeeWithMilk extends BeveragesWith {

    @Override
    public double price() {
        Coffee coffee = new Coffee();

        return coffee.price() + withMilk();
    }
}
