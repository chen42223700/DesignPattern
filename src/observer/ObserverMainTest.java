package observer;

import observer.observerEntity.CurrerntCondictionDisplay;
import observer.observerEntity.CurrerntCondictionDisplayUseSys;
import observer.observerEntity.StatisticDisplay;
import observer.subjectEntity.WeatherSubject;
import observer.subjectEntity.WeatherSubjectUseSys;

import java.util.Observable;

public class ObserverMainTest {

    public static void main(String[] args) {
        ObserverMainTest test = new ObserverMainTest();
        test.sysObserverTest();
    }

    public void nativeObservserTest(){
        //实现天气主题
        WeatherSubject weatherSubject = new WeatherSubject();
        //实现 展示当前天气状态观察者
        CurrerntCondictionDisplay currerntCondictionDisplay = new CurrerntCondictionDisplay();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        //把观察者注册到主题中去
        weatherSubject.registObserver(currerntCondictionDisplay);
        weatherSubject.registObserver(statisticDisplay);
        //更新天气状态 ，观察者会输出天气状态
        weatherSubject.setWeatheStatu(20, 10, 101);
        // 注销观察者
        weatherSubject.removeObserver(currerntCondictionDisplay);
        // 天气发生变化，观察者不会更新天气状态
        weatherSubject.setWeatheStatu(30, 5, 101);
    }

    public void sysObserverTest(){

        WeatherSubjectUseSys weather = new WeatherSubjectUseSys();
        CurrerntCondictionDisplayUseSys displayUseSys = new CurrerntCondictionDisplayUseSys(weather);

        weather.pull(20, 10, 101);

    }
}
