package decoratorPattern.condiment;

import decoratorPattern.basicComponent.Beverage;

/**
 * 具体调料，继承自调料抽象类
 */
public class Milk extends CondimentDecorator {
    //被装饰者
    private Beverage beverage;

    /**
     * 构造方法：
     * 传入不同的被装饰者（向上造型）
     * @param beverage
     */
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 具体描述，每个装饰着和都要返回之前所有的描述并加上自己的描述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * 计费：
     * 需要计算自己的金额加上被装饰者的金额
     * @return
     */
    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
