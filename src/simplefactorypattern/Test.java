package simplefactorypattern;

import simplefactorypattern.Factory.CarFactory;
import simplefactorypattern.Factory.CarMapFactory;
import simplefactorypattern.IProduct.Car;

/**
 * @author yangjun6
 * @date 2021-04-13 23:04
 */
public class Test {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("Audi");
        car.run();
        Car bmwCar = CarMapFactory.getCar("Bmw");
        bmwCar.run();
    }
}
