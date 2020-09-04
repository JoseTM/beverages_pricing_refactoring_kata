package beverages;

public class Cream extends BeverageDecorator {



	public Cream(Beverage newBeverage) {
		super(newBeverage);
	}

	@Override
	public double getPrice() {
		return beverage.getPrice() + 0.15;
	}

	@Override
	public String serveBevereage() {
		return super.serveBevereage() + " with Cream";
	}
}
