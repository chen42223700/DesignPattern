package observer.subjectEntity;

import observer.Entity.WeatherEntity;
import observer.observerInterface.Observer;
import observer.subjectInterface.Subject;

import java.util.HashSet;
import java.util.Set;

public class WeatherSubject implements Subject {

    //观察者容器，使用set。不能重复
    private Set<Observer> observers = new HashSet<Observer>();

    private WeatherEntity weatherEntity = new WeatherEntity(0, 0, 0);

    /**
     * 注册观察者
     *
     * @param observer
     */
    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 注销指定观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            try {
                observer.update(weatherEntity);
            } catch (RuntimeException e) {
                //处理异常，打日志，
            }
        }
    }

    /**
     * 当外部状态发生变化，调用该方法更改状态，同时通知所有观察者
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setWeatheStatu(int temperature, int humidity, int pressure) {
        this.weatherEntity.setTemperature(temperature);
        this.weatherEntity.setHumidity(humidity);
        this.weatherEntity.setPressure(pressure);
        notifyObserver();
    }
}
