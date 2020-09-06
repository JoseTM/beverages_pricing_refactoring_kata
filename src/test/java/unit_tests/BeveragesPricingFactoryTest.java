package unit_tests;

import beverages.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;


/**
 * Solo funcionarán correctamente los tests del primer tipo que se ejecute dentro de la clase BeveragesPricingFactoryTest
 * por el constructor singleton de la clase abastracta  BeberagesAbastractFactory
 */
public class BeveragesPricingFactoryTest {


    @Test
    public void computes_tea_price() throws IllegalAccessException, InstantiationException, InterruptedException {
        BeberagesTeaConcreteFactory factory = BeberagesTeaConcreteFactory.newInstance();
        //fallará por la unicidad impuesta en el constructor singleton de la clase abstracta
        //BeberagesAbastractFactory factory2 = BeberagesCoffeeConcreteFactory.newInstance();
        Beverage tea = factory.createBeverage();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }
    
    @Test
    public void computes_tea_with_cinammon_price() throws IllegalAccessException, InstantiationException {
        BeberagesTeaConcreteFactory factory = BeberagesTeaConcreteFactory.newInstance();
        Beverage tea = factory.createWithCinammon();
    	assertThat(tea.price(), is(closeTo(1.55, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() throws IllegalAccessException, InstantiationException {
        BeberagesTeaConcreteFactory factory = BeberagesTeaConcreteFactory.newInstance();
        Beverage tea = factory.createWithMilk();
        assertThat(tea.price(), is(closeTo(1.60, 0.001)));
    }


    @Test
    public void computes_coffee_price() throws IllegalAccessException, InstantiationException, InterruptedException {
        BeberagesCoffeeConcreteFactory factory = BeberagesCoffeeConcreteFactory.newInstance();
        Beverage coffee = factory.createBeverage();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() throws IllegalAccessException, InstantiationException {
        BeberagesCoffeeConcreteFactory factory = BeberagesCoffeeConcreteFactory.newInstance();
        Beverage coffeeWithMilk = factory.createWithMilk();
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() throws IllegalAccessException, InstantiationException {
        BeberagesCoffeeConcreteFactory factory = BeberagesCoffeeConcreteFactory.newInstance();
        Beverage coffeeWithMilkAndCream = factory.createWithMilkAndCream();
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() throws IllegalAccessException, InstantiationException {
        BeberagesHotChocolateConcreteFactory factory = BeberagesHotChocolateConcreteFactory.newInstance();
        Beverage hotChocolate = factory.createBeverage();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() throws IllegalAccessException, InstantiationException {
        BeberagesHotChocolateConcreteFactory factory = BeberagesHotChocolateConcreteFactory.newInstance();
        Beverage hotChocolateWithCream = factory.createWithCream();
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }
}
