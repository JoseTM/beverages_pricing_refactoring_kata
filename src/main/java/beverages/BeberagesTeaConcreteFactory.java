package beverages;

import java.util.Objects;

public class BeberagesTeaConcreteFactory extends BeberagesAbastractFactory {

    private static BeberagesTeaConcreteFactory _concreteFactory;

    protected BeberagesTeaConcreteFactory(){

    };

    public static BeberagesTeaConcreteFactory newInstance() throws InstantiationException, IllegalAccessException {
        _concreteFactory = new BeberagesTeaConcreteFactory();
        return (BeberagesTeaConcreteFactory)newInstanceOf(_concreteFactory);
    };

    @Override
    public Beverage createBeverage(){
        return Waiter.tea().make();
    }

    @Override
    public Beverage createWithMilk() {
        return Waiter.tea().withMilk().make();
    }

    @Override
    public Beverage createWithCinammon() {
        return Waiter.tea().withCinammon().make();
    }

    @Override
    public Beverage createWithCream() {
        return null;
    }


}
