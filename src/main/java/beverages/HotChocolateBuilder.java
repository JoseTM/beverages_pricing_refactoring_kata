package beverages;

import beverages.interfaces.IBeverage;

public class HotChocolateBuilder {
	private IBeverage beverage;
	private boolean withCream = false; 
	private boolean withCinammon = false;
	
	
	public HotChocolateBuilder() {
		this.beverage = new HotChocolate();
	}
	
	
    public final HotChocolateBuilder withCream() {
    	this.withCream = true;
    	return this;
    }
    public final HotChocolateBuilder withCinammon(){
    	this.withCinammon = true;
    	return this;
    	
    }
    
    public final IBeverage make() {
    	
    	if (withCream)
    		this.beverage = new WithCream(beverage);
    	if (withCinammon)
    		this.beverage = new WithCinammon(beverage);
    	return this.beverage;
    }
	
	
}
