package beverages;

public class Milk extends BeverageDecorator {

	public Milk(Beverage newBeverage) {
		super(newBeverage);
	}

	@Override
	public double getPrice() {
		return beverage.getPrice() +  0.10;
   	}

	@Override
	public String serveBevereage() {
		return super.serveBevereage() + " with milk";
	}
}
