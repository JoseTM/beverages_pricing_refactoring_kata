package beverages;

public class BeverageDecorator implements Beverage{
    Beverage beverage;

    public BeverageDecorator(Beverage newBeverage){
        this.beverage = newBeverage;
    }
    @Override
    public double getPrice() {
        return beverage.getPrice();
    }

    @Override
    public String serveBevereage() {
        return beverage.serveBevereage();
    }
}
