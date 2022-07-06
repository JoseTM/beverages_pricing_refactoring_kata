package beverages;

import beverages.builders.CoffeeBuilder;
import beverages.builders.HotChocolateBuilder;
import beverages.builders.TeaBuilder;

public class Waiter {

	public static TeaBuilder tea() {
		return new TeaBuilder();
	}
	
	public static CoffeeBuilder coffee() {
		return new CoffeeBuilder();
	}

	public static HotChocolateBuilder hotChocolate() {
		
		return new HotChocolateBuilder();
	}
}
