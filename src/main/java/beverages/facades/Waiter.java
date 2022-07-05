package beverages.facades;

import beverages.services.CoffeeBuilder;
import beverages.services.HotChocolateBuilder;
import beverages.services.TeaBuilder;

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
