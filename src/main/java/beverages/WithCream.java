package beverages;

import beverages.interfaces.IBeverage;

public class WithCream implements IBeverage {

	
	private final IBeverage beverage;
	
	   public WithCream(IBeverage beverage) {
		   this.beverage = beverage; 
	   }
	@Override
	public double price() {
		// TODO Auto-generated method stub
		return beverage.price() + 0.15;
	}

}
