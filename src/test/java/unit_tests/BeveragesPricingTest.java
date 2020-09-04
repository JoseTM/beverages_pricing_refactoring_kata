package unit_tests;

import beverages.*;
import com.sun.deploy.util.Waiter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.getPrice(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.getPrice(), is(closeTo(1.50, 0.001)));
    }
    
    @Test
    public void computes_tea_with_cinammon_price() {
    	Beverage tea = new Cinammon(new Tea()) ;
    	assertThat(tea.getPrice(), is(closeTo(1.55, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.getPrice(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage teaWithMilk = new Milk( new Tea());
        assertThat(teaWithMilk.getPrice(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffeeWithMilk = new Milk (new Coffee());
        assertThat(coffeeWithMilk.getPrice(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Beverage  coffeeWithMilkAndCream = new Cream (new Milk (new Coffee()));
        assertThat(coffeeWithMilkAndCream.getPrice(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = new Cream (new HotChocolate());
        assertThat(hotChocolateWithCream.getPrice(),  is(closeTo(1.60, 0.001)));
    }
}
