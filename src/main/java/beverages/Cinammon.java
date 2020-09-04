package beverages;

public class Cinammon extends BeverageDecorator {


	public Cinammon(Beverage newBeverage) {
		super(newBeverage);
	}

	@Override
	public double getPrice() {
		return beverage.getPrice() + 0.05;
	}

	@Override
	public String serveBevereage() {
		return super.serveBevereage() + " with cinammon";
	}
}
