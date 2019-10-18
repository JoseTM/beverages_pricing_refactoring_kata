package beverages;

public class HotChocolateBuilder {
	private Beverage beverage;
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
    
    public final Beverage make() {
    	
    	if (withCream)
    		this.beverage = new WithCream(beverage);
    	if (withCinammon)
    		this.beverage = new WithCinammon(beverage);
    	return this.beverage;
    }
	
	
}
