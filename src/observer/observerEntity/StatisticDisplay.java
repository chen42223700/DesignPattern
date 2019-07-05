package observer.observerEntity;

import observer.Entity.WeatherEntity;
import observer.observerInterface.DisplayElement;
import observer.observerInterface.Observer;

/**
 * 展示最大温度，最小温度，平均温度
 */
public class StatisticDisplay implements Observer, DisplayElement {

    private int maxTemp = -274;

    private int minTemp = -274;

    private int tempSum = -274;

    private int numReads = 0;



    @Override
    public void display() {
        System.out.println("-------------------------");
        System.out.println("MaxTemp:" + this.maxTemp);
        System.out.println("MinTemp:" + this.minTemp);
        System.out.println("AvgTemp:" + this.tempSum/this.numReads);

    }

    @Override
    public void update(Object o) throws RuntimeException {
        if (o instanceof WeatherEntity){
            WeatherEntity weatherEntity = (WeatherEntity) o;
            //简单的初始化方法，可修改为更好的
            if (this.minTemp == -274){
                this.minTemp = weatherEntity.getTemperature();
                this.maxTemp = weatherEntity.getTemperature();
                this.tempSum = weatherEntity.getTemperature();
                numReads++;
                display();
                return;
            }

            //变更最大温度
            if (this.maxTemp < weatherEntity.getTemperature()){
                this.maxTemp = weatherEntity.getTemperature();
            }

            //变更最小温度
            if (this.minTemp > weatherEntity.getTemperature()){
                this.minTemp = weatherEntity.getTemperature();
            }

            //计算平均温度
            tempSum += weatherEntity.getHumidity();
            numReads++;

            display();
        }else {
            throw new RuntimeException("参数类型错误");
        }
    }

}
