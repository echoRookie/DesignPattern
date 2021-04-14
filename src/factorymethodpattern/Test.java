package factorymethodpattern;

import factorymethodpattern.AbstractProduct.Car;
import factorymethodpattern.factory.AudiFactory;
import factorymethodpattern.factory.BmwFactory;

/**
 * @author yangjun6
 * @date 2021-04-14 11:56
 */
public class Test {
    public static void main(String[] args) {
        //生产奥迪车
        Car car = new AudiFactory().productCar();
        car.run();
        // 生产宝马
        Car bmwCar = new BmwFactory().productCar();
        bmwCar.run();
    }
}

