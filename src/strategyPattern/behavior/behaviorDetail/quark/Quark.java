package strategyPattern.behavior.behaviorDetail.quark;

import strategyPattern.behavior.behaviorInterface.QuarkBehavior;

/**
 * 叫的具体实现：呱呱叫
 */
public class Quark implements QuarkBehavior {

    @Override
    public void quark() {
        System.out.println("呱呱叫!");
    }
}
