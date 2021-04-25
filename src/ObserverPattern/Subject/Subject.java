package ObserverPattern.Subject;

import ObserverPattern.Observer.Observer;

/**
 * @author yangjun6
 * @date 2021-04-25 10:42
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void change();
}
