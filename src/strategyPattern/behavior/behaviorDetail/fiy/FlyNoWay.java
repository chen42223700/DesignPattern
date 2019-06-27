package strategyPattern.behavior.behaviorDetail.fiy;

import strategyPattern.behavior.behaviorInterface.FlyBehavior;

/**
 * 飞翔的具体实现:不会飞行
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
