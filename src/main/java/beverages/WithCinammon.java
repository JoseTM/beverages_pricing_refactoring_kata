package beverages;

import beverages.interfaces.IBeverage;

public class WithCinammon implements IBeverage {
	
	private final IBeverage beverage;
	
	public WithCinammon(IBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double price() {
		return beverage.price() + 0.05;
	}

}
