package factoryPattern.store.PizzaStoreEntity;

import factoryPattern.entity.NYStyleCheesePizza;
import factoryPattern.entity.NYStyleVeggiePizza;
import factoryPattern.entity.Pizza;
import factoryPattern.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }if ("veggle".equals(type)){
            return new NYStyleVeggiePizza();
        }else {
            return null;
        }
    }
}
