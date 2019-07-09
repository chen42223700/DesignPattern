package observerPattern;

import observerPattern.observerEntity.CurrerntCondictionDisplay;
import observerPattern.observerEntity.CurrerntCondictionDisplayUseSys;
import observerPattern.observerEntity.StatisticDisplay;
import observerPattern.subjectEntity.WeatherSubject;
import observerPattern.subjectEntity.WeatherSubjectUseSys;

/**
 *  观察者模式：
 *  定义:观察者模式定义了依稀了对象之间的一对多的关系，
 *      当一个对象改变状态时，其他以来者都会收到通知
 *
 *  通俗来说就是将将主题和观察者进行松耦合了，主题不需要知道观察者们的任何处理细节，
 *  甚至不需要将最新的数去推送给观察者，只要告诉观察者：我更新了，观察者和们会根据自己
 *  的需求决定如何做
 *
 *  一个简单的结构分析（最简单的思路，更复杂的可以参考Java Observerable类）：
 *  1.主题接口subject
 *  应该至少有三个方法
 *  a，注册观察者
 *  b.删除观察者
 *  c.通知所有观察者
 *
 *  2.观察者接口observer
 *  最基本的只要有一个方法就行：接受通知的方法，鸡当数据更新了，主题要调用
 *  这个方法告诉所有观察者我更新了
 *
 *  3.主图实体类实现了主题接口
 *  属性：
 *  a.需要处理的属性；以本例来说就是温度，湿度，气压
 *  b.装观察者的容器，用来保存需要通知的观察者
 *  其实还有很多，就看各自的需求了，了比如各种属性的get/set方法，如果有需要也可以通过出来
 *
 *  4.观察者实体类，实现了观察者接口，具体操作逻辑可以按照需求来
 *
 *  Java中自带了观察者模式实现方法，功能比本例更加丰富
 *  但是有一个缺点，器主题类Observerable是类而非接口，
 *  这就导致当我们想要继承其他接口时，就无法使用这个类
 *  所以如果有需要，可以自己设计一要观察者模块
 *
 */
public class ObserverMainTest {

    public static void main(String[] args) {
        ObserverMainTest test = new ObserverMainTest();
        test.sysObserverTest();
    }

    /**
     * 自己实现的观察者模块测试
     */
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

    /**
     * 使用系统自带的观察者模块测试
     */
    public void sysObserverTest(){

        WeatherSubjectUseSys weather = new WeatherSubjectUseSys();
        CurrerntCondictionDisplayUseSys displayUseSys = new CurrerntCondictionDisplayUseSys(weather);

        weather.pull(20, 10, 101);

    }
}
