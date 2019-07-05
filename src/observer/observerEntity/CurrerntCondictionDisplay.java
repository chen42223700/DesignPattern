package observer.observerEntity;

import observer.Entity.WeatherEntity;
import observer.observerInterface.DisplayElement;
import observer.observerInterface.Observer;

/**
 * 显示当前天气状况的对象
 */
public class CurrerntCondictionDisplay implements Observer, DisplayElement {

    //天气实例
    private WeatherEntity weatherEntity;

    /**
     * 展示天气
     */
    @Override
    public void display() {
        System.out.println(weatherEntity.toString());
    }

    /**
     * 接受通知并处理数据
     * @param o
     * @throws Exception
     */
    @Override
    public void update(Object o) throws RuntimeException {
        if (o instanceof  WeatherEntity){
            this.weatherEntity = (WeatherEntity) o;
        }else {
            throw new RuntimeException("参数类型错误");
        }
        //调用展示方法
        display();
    }
}
