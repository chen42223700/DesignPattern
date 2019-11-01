package factoryPattern.store.PizzaStoreEntity;

import factoryPattern.entity.ChicagoStyleCheesePizza;
import factoryPattern.entity.ChicagoStyleVeggiePizza;
import factoryPattern.entity.Pizza;
import factoryPattern.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }if ("veggle".equals(type)){
            return new ChicagoStyleVeggiePizza();
        }else {
            return null;
        }
    }
}
