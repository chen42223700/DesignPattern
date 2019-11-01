package factoryPattern.entity;

/**
 * Chicago Style Pizza
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        toppings.add("Chicago Style Veggie");
    }

    @Override
    public void cut() {
        System.out.println("Chacago Cut");
    }
}
