package decoratorPattern;

import decoratorPattern.basicComponent.Beverage;
import decoratorPattern.condiment.Milk;
import decoratorPattern.condiment.Mocha;
import decoratorPattern.condiment.Soy;
import decoratorPattern.condiment.Whip;
import decoratorPattern.drink.Espresso;

/**
 * 装饰者模式:
 * 装饰者模式可以动态的将责任附加在对象上，
 * 若要拓展功能，装饰者模式提供了比继承关系根由弹性的替代方案
 *
 * 通俗来讲：
 * 原来被装饰者者在便携一个方法的时候，需要考虑到所有与这个
 * 被装饰者相关的参数，
 * 而使用装饰者模式，则只需要关注本本身的属性，
 * 只要在重写方法处理的时候记得调用基类的方法
 * 这样在最终方法调用的时候，通过层层迭代，正确的处理数据
 *
 * 装饰者模式使每个类只需要关注自己的逻辑，而不需要关注其他类的处理细节
 * 使逻辑更加清晰，
 * 但是装饰者模式也有缺点，装饰者模式通常有很多的装饰者类，在阅读代码
 * 的时候往往会不知道这些装饰者的用途以及如何准确的使用这些装饰者类
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {

        //name如何实现一个加牛奶，摩卡，豆浆，奶泡的浓缩咖啡呢？
        Beverage beverage = new Milk(new Mocha(new Soy(new Whip(new Espresso()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        /**
         * 可以看到最终的饮料beverage是纽带包装了摩卡包装了豆浆包装了奶泡的浓缩咖啡
         * 我们可以发现，用装饰者模式设计的代码
         * 每个饮料喝配料之间都是互相独立的
         * 在搭配时只要把自身（被装饰者）传入装饰者的狗仔方法里就行了
         * 在计算金额时，装饰者会迭代的计算所有被装饰者的金额
         */
    }
}
