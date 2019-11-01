package factoryPattern.store;

import factoryPattern.entity.Pizza;

/**
 * pizza商店的父类
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String pizzaType){

        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
