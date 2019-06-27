package strategyPattern;

import strategyPattern.behavior.behaviorDetail.fiy.FlyNoWay;
import strategyPattern.behavior.behaviorDetail.quark.MuteQuark;
import strategyPattern.entity.expansion.ModelDuck;
import strategyPattern.entity.expansion.NormalDuck;
import strategyPattern.entity.expansion.ToyDuck;

/**
 * 总结；策略模式就是，将行为的具体实现（算法），从对象中剥离出来，
 * 根据具体的对象和场景，可以是用不用的具体实现（算法）
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        System.out.println("***********正常鸭*************");
        NormalDuck normalDuck = new NormalDuck();
        normalDuck.performFly();
        normalDuck.performQuark();

        System.out.println("***********玩具鸭***********");
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.performFly();
        toyDuck.performQuark();

        System.out.println("***********模型鸭***********");
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuarkBehavior(new MuteQuark());
        modelDuck.performFly();
        modelDuck.performQuark();
    }
}
