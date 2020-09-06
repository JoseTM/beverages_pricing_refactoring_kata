package beverages.factorias;

import beverages.interfaces.IBeverage;
import beverages.Waiter;
import beverages.factorias.abstractas.BeberagesAbastractFactory;

public class BeberagesHotChocolateConcreteFactory extends BeberagesAbastractFactory {

    private static BeberagesHotChocolateConcreteFactory _concreteFactory;


    public static BeberagesHotChocolateConcreteFactory newInstance() throws InstantiationException, IllegalAccessException {
            _concreteFactory = new BeberagesHotChocolateConcreteFactory() ;
        return (BeberagesHotChocolateConcreteFactory)newInstanceOf(_concreteFactory);
    };

    @Override
    public IBeverage createBeverage(){
        return Waiter.hotChocolate().make();
    }

    @Override
    public IBeverage createWithMilk() {
        return null;
    }

    @Override
    public IBeverage createWithCinammon() {
        return Waiter.hotChocolate().withCinammon().make();
    }

    @Override
    public IBeverage createWithCream() {
        return Waiter.hotChocolate().withCream().make();
    }


}
