package decoratorPattern.condiment;

import decoratorPattern.basicComponent.Beverage;

/**
 * 所有调料都必须继承该抽象类
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 修改getDescription方法，每个装饰着都必须实现自己的描述
     * 其实不继承该来也行，只要在装饰者中重写getDescription方法
     * 但是有课能回忘记，这里就谢伟abstract，继承该类必须重写
     * @return
     */
    @Override
    public abstract String getDescription();
}
