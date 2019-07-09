package decoratorPattern.basicComponent;

/**
 * 装饰者（本例是饮料）的基类
 * 所有的装饰者和被装饰者的都必须继承该类
 */
public abstract class Beverage {

    protected String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
