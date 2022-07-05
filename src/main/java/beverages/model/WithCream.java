package beverages.model;

import beverages.model.Beverage;

public class WithCream implements Beverage {

	
	private final Beverage beverage;
	
	   public WithCream(Beverage beverage) {
		   this.beverage = beverage; 
	   }
	@Override
	public double price() {
		// TODO Auto-generated method stub
		return beverage.price() + 0.15;
	}

}
