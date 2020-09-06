package unit_tests;

import beverages.Coffee;
import beverages.HotChocolate;
import beverages.Tea;
import beverages.Waiter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Waiter waiter = new Waiter();
        Coffee coffee = waiter.serveCoffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Waiter waiter = new Waiter();
        Tea tea = waiter.serveTea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Waiter waiter = new Waiter();
        HotChocolate hotChocolate = waiter.serveHotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Waiter waiter = new Waiter();
        Tea teaWithMilk = waiter.serveTeaWithMilk();
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_tea_with_cinammon_price() {
        //Tea tea = Waiter.tea().withCinammon().make();
    	//assertThat(tea.price(), is(closeTo(1.55, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        //IBeverage coffeeWithMilk = Waiter.coffee().withMilk().make();
        //assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        //IBeverage coffeeWithMilkAndCream = Waiter.coffee().withMilk().withCream().make();
        //assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        //HotChocolate hotChocolateWithCream = Waiter.hotChocolate().withCream().make();
        //assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }
}
