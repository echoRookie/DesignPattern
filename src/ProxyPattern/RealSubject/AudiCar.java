package ProxyPattern.RealSubject;

import ProxyPattern.Subject.Car;

/**
 * @author yangjun6
 * @date 2021-04-21 11:32
 */
public class AudiCar implements Car {
    @Override
    public void start() {
        System.out.println("奥迪汽车启动");
    }
}
