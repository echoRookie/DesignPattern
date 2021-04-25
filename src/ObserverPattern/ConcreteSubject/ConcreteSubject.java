package ObserverPattern.ConcreteSubject;

import ObserverPattern.Observer.Observer;
import ObserverPattern.Subject.Subject;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yangjun6
 * @date 2021-04-25 10:43
 */
public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void change() {
        for(Observer o : observers){
            o.update();
        }
    }
}
