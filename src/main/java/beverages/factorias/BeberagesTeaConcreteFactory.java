package beverages.factorias;

import beverages.interfaces.IBeverage;
import beverages.Waiter;
import beverages.factorias.abstractas.BeberagesAbastractFactory;

public class BeberagesTeaConcreteFactory extends BeberagesAbastractFactory {

    private static BeberagesTeaConcreteFactory _concreteFactory;


    public static BeberagesTeaConcreteFactory newInstance() throws InstantiationException, IllegalAccessException {
        _concreteFactory = new BeberagesTeaConcreteFactory();
        return (BeberagesTeaConcreteFactory)newInstanceOf(_concreteFactory);
    };

    @Override
    public IBeverage createBeverage(){
        return Waiter.tea().make();
    }

    @Override
    public IBeverage createWithMilk() {
        return Waiter.tea().withMilk().make();
    }

    @Override
    public IBeverage createWithCinammon() {
        return Waiter.tea().withCinammon().make();
    }

    @Override
    public IBeverage createWithCream() {
        return null;
    }


}
