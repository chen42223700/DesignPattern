package observer.observerEntity;

import observer.observerInterface.DisplayElement;
import observer.subjectEntity.WeatherSubjectUseSys;

import java.util.Observable;
import java.util.Observer;

public class CurrerntCondictionDisplayUseSys implements Observer, DisplayElement {

    private int temperature;

    private Observable observable;
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherSubjectUseSys){
            this.temperature = ((WeatherSubjectUseSys) o) .getTemperature();
            display();
        }else {

        }
    }

    @Override
    public void display() {
        System.out.println("----------CurrentTemperature-----------");
        System.out.println("Temperature: " + this.temperature);
    }

    public CurrerntCondictionDisplayUseSys(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }
}
