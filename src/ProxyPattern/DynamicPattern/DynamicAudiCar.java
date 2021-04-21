package ProxyPattern.DynamicPattern;

import ProxyPattern.DynamicPattern.Car;

/**
 * @author yangjun6
 * @date 2021-04-21 14:07
 */
public class DynamicAudiCar implements Car {
    @Override
    public void start() {
        System.out.println("动态代理奥迪车");
    }

    @Override
    public void stop() {
        System.out.println("动态代理奥迪车2");
    }
}
