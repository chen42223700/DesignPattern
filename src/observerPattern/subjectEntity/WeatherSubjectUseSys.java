package observerPattern.subjectEntity;

import java.util.Observable;

/**
 * 使用系统的观察者方法
 */
public class WeatherSubjectUseSys extends Observable {

    /**
     * 温度
     */
    private int temperature;

    /**
     * 湿度
     */
    private int humidity;

    /**
     * 气压
     */
    private int pressure;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void pull(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //setChange方法,只有changed是true时，才会通知观察者
        this.setChanged();
        //通知所有观察者主题更新了
        //同时也提供了带参数的方法，提供传参功能
        this.notifyObservers();
    }

}
