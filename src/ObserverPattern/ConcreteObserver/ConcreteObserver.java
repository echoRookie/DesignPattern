package ObserverPattern.ConcreteObserver;

import ObserverPattern.Observer.Observer;

/**
 * @author yangjun6
 * @date 2021-04-25 10:52
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("股灾来了");
    }
}
