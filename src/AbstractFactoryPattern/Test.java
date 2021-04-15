package AbstractFactoryPattern;

import AbstractFactoryPattern.AbstractProduct.Car;
import AbstractFactoryPattern.AbstractProduct.Engine;
import AbstractFactoryPattern.Factory.AudiFactory;

/**
 * @author yangjun6
 * @date 2021-04-14 17:47
 */
public class Test {
    public static void main(String[] args) {
        //奥迪整套产品
        Car audiCar = new AudiFactory().productCar();
        Engine audiEngine = new AudiFactory().productEnige();
        audiCar.run();
        audiEngine.start();
    }
}
