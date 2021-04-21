package ProxyPattern.ProxySubject;

import ProxyPattern.RealSubject.AudiCar;
import ProxyPattern.Subject.Car;

/**
 * @author yangjun6
 * @date 2021-04-21 11:34
 */
public class ProxyAudiCar implements Car {
    private Car car;
    public ProxyAudiCar(Car car){
        this.car = car;
    }
    @Override
    public void start() {
        System.out.println("启动前");
        car.start();
        System.out.println("启动后");
    }
}
