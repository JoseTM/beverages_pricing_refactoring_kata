package beverages;

import java.util.Objects;

public class BeberagesHotChocolateConcreteFactory extends BeberagesAbastractFactory {

    private static BeberagesHotChocolateConcreteFactory _concreteFactory;

    protected BeberagesHotChocolateConcreteFactory(){

    };

    public static BeberagesHotChocolateConcreteFactory newInstance(){
        if (Objects.isNull( _concreteFactory)) {

            _concreteFactory = new BeberagesHotChocolateConcreteFactory() ;
        }
        return _concreteFactory;
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
