package ProxyPattern.DynamicPattern;

import ProxyPattern.RealSubject.AudiCar;
import ProxyPattern.DynamicPattern.Car;

/**
 * @author yangjun6
 * @date 2021-04-21 14:25
 */
public class Test {
    public static void main(String[] args) {
        Car car = (Car) JdkProxyFactory.getProxyInstance(new DynamicAudiCar());
        car.start();
        car.stop();
    }
}
