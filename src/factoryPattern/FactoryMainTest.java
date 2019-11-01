package factoryPattern;

import factoryPattern.entity.Pizza;
import factoryPattern.store.PizzaStore;
import factoryPattern.store.PizzaStoreEntity.ChicagoPizzaStore;
import factoryPattern.store.PizzaStoreEntity.NYPizzaStore;

/**
 * 工厂模式：
 * 把原本需要new出来的对象,交给公共的create方法去创建对象
 * 原本业务处理类不需要关注类的创建，只需要关注业务处理,
 * 可以用于累比较多时，根据不同的入参创建不同的类，
 * 把创建类的方法交给一个类（或者虚拟类）去处理，二自己只关注
 * 业务
 */
public class FactoryMainTest {

    public static void main(String[] args) {
        PizzaStore NYPizzaStore = new NYPizzaStore();
        Pizza NYPizza = NYPizzaStore.orderPizza("cheese");
        System.out.println(NYPizza.getName());

        System.out.println("------------------------");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("veggle");
        System.out.println(chicagoPizza.getName());
    }
}
