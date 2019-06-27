package strategyPattern.entity.expansion;

import strategyPattern.behavior.behaviorDetail.fiy.FlyWithWings;
import strategyPattern.behavior.behaviorDetail.quark.Quark;
import strategyPattern.entity.base.Duck;

/**
 * 这是一只普通的鸭子，其构造方法中实现了其真正飞行的实现和叫的实现
 * 这只是Demo，其实可以修改为通过spring注入或者传入指定的behavior入参实现
 */
public class NormalDuck extends Duck {

    public NormalDuck() {
        flyBehavior = new FlyWithWings();
        quarkBehavior = new Quark();
    }
}
