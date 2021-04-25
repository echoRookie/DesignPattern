package ObserverPattern;

import ObserverPattern.ConcreteObserver.ConcreteObserver;
import ObserverPattern.ConcreteSubject.ConcreteSubject;
import ObserverPattern.Observer.Observer;
import ObserverPattern.Subject.Subject;

/**
 * @author yangjun6
 * @date 2021-04-25 10:53
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        subject.change();
    }
}
