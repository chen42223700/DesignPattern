package strategyPattern.behavior.behaviorDetail.quark;

import strategyPattern.behavior.behaviorInterface.QuarkBehavior;

/**
 * 叫的具体实现：不会叫
 */
public class MuteQuark implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("Can't Quark!");
    }
}
