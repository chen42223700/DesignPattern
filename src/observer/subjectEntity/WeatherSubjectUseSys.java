package observer.subjectEntity;

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
        this.setChanged();
        this.notifyObservers();
    }

}
