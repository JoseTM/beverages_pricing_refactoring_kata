package beverages;

public class WithCinammon implements Beverage {
	
	private final Beverage beverage;
	
	public WithCinammon(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double price() {
		return beverage.price() + 0.05;
	}

}
