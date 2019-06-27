package strategyPattern.behavior.behaviorDetail.fiy;

import strategyPattern.behavior.behaviorInterface.FlyBehavior;

/**
 * 飞行的具体实现，通过翅膀飞行
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
