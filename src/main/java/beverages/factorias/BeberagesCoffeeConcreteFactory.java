package beverages.factorias;

import beverages.interfaces.IBeverage;
import beverages.Waiter;
import beverages.factorias.abstractas.BeberagesAbastractFactory;

public class BeberagesCoffeeConcreteFactory extends BeberagesAbastractFactory {

    private static BeberagesCoffeeConcreteFactory _concreteFactory;


    public static BeberagesCoffeeConcreteFactory newInstance() throws InstantiationException, IllegalAccessException {
         _concreteFactory = new BeberagesCoffeeConcreteFactory() ;
        return (BeberagesCoffeeConcreteFactory) newInstanceOf(_concreteFactory);
    };

    @Override
    public IBeverage createBeverage(){
        return Waiter.coffee().make();
    }

    @Override
    public IBeverage createWithMilk() {
        return Waiter.coffee().withMilk().make();
    }

    @Override
    public IBeverage createWithCinammon() {
        return Waiter.coffee().withCinammon().make();
    }

    @Override
    public IBeverage createWithCream() {
        return Waiter.coffee().withCream().make();
    }

    /**
     * Métododo presente solo en la instancia concreta
     * @return
     */
    public IBeverage createWithMilkAndCream(){
        return Waiter.coffee().withMilk().withCream().make();
    };


}
