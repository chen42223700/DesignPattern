package factoryPattern.entity;

/**
 * NY Style Pizza
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Douth";
        sauce = "Marinara Sauce";

        toppings.add("FRATED Reggiano Chheese");
    }
}
