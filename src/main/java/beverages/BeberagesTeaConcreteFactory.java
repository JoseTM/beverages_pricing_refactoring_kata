package beverages;

import java.util.Objects;

public class BeberagesTeaConcreteFactory extends BeberagesAbastractFactory {

    private static BeberagesTeaConcreteFactory _concreteFactory;

    protected BeberagesTeaConcreteFactory(){

    };

    public static BeberagesTeaConcreteFactory newInstance(){
        if (Objects.isNull( _concreteFactory)) {

            _concreteFactory = new BeberagesTeaConcreteFactory() ;
        }
        return _concreteFactory;
    };

    public Beverage createTea(){
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
