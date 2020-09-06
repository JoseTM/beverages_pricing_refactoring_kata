package beverages;

import java.util.Objects;

public class BeberagesHotChocolateConcreteFactory extends BeberagesAbastractFactory {

    private static BeberagesHotChocolateConcreteFactory _concreteFactory;

    protected BeberagesHotChocolateConcreteFactory(){

    };

    public static BeberagesHotChocolateConcreteFactory newInstance() throws InstantiationException, IllegalAccessException {
            _concreteFactory = new BeberagesHotChocolateConcreteFactory() ;
        return (BeberagesHotChocolateConcreteFactory)newInstanceOf(_concreteFactory);
    };

    @Override
    public Beverage createBeverage(){
        return Waiter.hotChocolate().make();
    }

    @Override
    public Beverage createWithMilk() {
        return null;
    }

    @Override
    public Beverage createWithCinammon() {
        return Waiter.hotChocolate().withCinammon().make();
    }

    @Override
    public Beverage createWithCream() {
        return Waiter.hotChocolate().withCream().make();
    }


}
