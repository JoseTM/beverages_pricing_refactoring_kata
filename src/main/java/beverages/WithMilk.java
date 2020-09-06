package beverages;

import beverages.interfaces.IBeverage;

public class WithMilk implements IBeverage {
	
	private final IBeverage beverage;
	
	   public WithMilk(IBeverage beverage) {
		   this.beverage = beverage; 
	   }
	   @Override
	    public double price() {
	        return beverage.price() +  0.10;
	   }
}
