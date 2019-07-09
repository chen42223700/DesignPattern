package decoratorPattern.drink;

import decoratorPattern.basicComponent.Beverage;

public class HouseBlend extends Beverage {

    /**
     * 构造方法，设置初始属性
     */
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
