package strategyPattern.entity.base;

import strategyPattern.behavior.behaviorInterface.FlyBehavior;
import strategyPattern.behavior.behaviorInterface.QuarkBehavior;

/**
 * 策略模式：
 *  定义了算法族，分别封装起来，让他们之间可以互相替换
 *  此模式让算法的变化独立于使用算法的客户，算法可以轻易的被扩充和改变，
 *  如果需要，甚至可以在运行时改变算法。
 *
 *
 *  通俗的解释：
 *  鸭子都会叫和飞，我们设计一个父类，写好叫和飞的方法，
 *  现在有两个鸭子，呱呱鸭和吱吱鸭，他们都有继承自鸭的父类，
 *  但是由于他们的叫声不同，我们通常的解决办法是，自类重写父类叫的方法
 *  这样的确实现了功能，那现在有来了一个需求，，鸭子在叫完之后要“喝水”，、
 *  现在要如何修改呢？，在每个继承类的叫的方法下都要添加“喝水”的方法，
 *  如果子类很多的话这是一个相当大的工作量，且违反了重复代码尽量少的原则
 *  而策略模式就是为了解决这一问题：
 *  回到最初的地方，鸭子确实都会叫和飞，不同的鸭子有不同的叫和飞的方法
 *  但是鸭子并不需要知道是如何叫或者飞的，他只要有叫和飞的方法和一些公共的都要
 *  执行的操作就行，
 *  而具体的叫和飞的实现，我们从鸭子众剥离出来，不同的鸭子需要哪一种方法，就自己去
 *  装配该种方法。
 *
 *  就如上述例子，在父类鸭子中不需要care各种鸭子该怎么叫，只需要调用叫的方法后，在去“喝水”就行了
 *
 *  详见代码：
 *
 */
public class Duck {

    //鸭子有飞翔的行为，具体实现不关注
    protected FlyBehavior flyBehavior;
    //同样鸭子有叫的行为，也不关注其实现
    protected QuarkBehavior quarkBehavior;
    /**
     * 提供修改飞行方法的方法
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    /**
     * 提供修改叫声的方法
     * @param quarkBehavior
     */
    public void setQuarkBehavior(QuarkBehavior quarkBehavior) {
        this.quarkBehavior = quarkBehavior;
    }
    /**
     * 调用飞行方法
     */
    public void performFly(){
        flyBehavior.fly();
    }
    /**
     * 调用叫方法
     */
    public void performQuark(){
        quarkBehavior.quark();
    }
}
