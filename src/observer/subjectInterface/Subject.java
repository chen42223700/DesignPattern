package observer.subjectInterface;

import observer.observerInterface.Observer;

/**
 * 主题
 * 三个属性
 * 1.观察者的注册
 * 2.啊观察者的注销
 * 3.通知所有观察者
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registObserver(Observer observer);

    /**
     * 注销观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

    /*
     * 可以加上批量注册和批量注销，这里省略了
     */
}
