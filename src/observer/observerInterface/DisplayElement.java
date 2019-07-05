package observer.observerInterface;

/**
 * 展示接口，
 * 展示方法不放在观察这中：
 * 是因为，并不是每个观察者都需要展示
 */
public interface DisplayElement {

    /**
     * 展示方法
     */
    void display();
}
