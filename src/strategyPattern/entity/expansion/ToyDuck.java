package strategyPattern.entity.expansion;

import strategyPattern.behavior.behaviorDetail.fiy.FlyNoWay;
import strategyPattern.behavior.behaviorDetail.quark.Squeak;
import strategyPattern.entity.base.Duck;

/**
 * 这是一只玩具鸭，不会飞，会吱吱叫，同样在构造方法中设置真正的飞行和叫的实现
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new FlyNoWay();
        quarkBehavior = new Squeak();
    }
}
