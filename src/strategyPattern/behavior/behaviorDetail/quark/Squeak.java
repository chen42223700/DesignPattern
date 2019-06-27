package strategyPattern.behavior.behaviorDetail.quark;

import strategyPattern.behavior.behaviorInterface.QuarkBehavior;

/**
 * 叫的具体实现：吱吱叫
 */
public class Squeak implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("吱吱叫!");
    }
}
