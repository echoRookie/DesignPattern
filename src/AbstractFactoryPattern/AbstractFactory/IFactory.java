package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.AbstractProduct.Car;
import AbstractFactoryPattern.AbstractProduct.Engine;

/**
 * @author yangjun6
 * @date 2021-04-14 17:40
 */
public interface IFactory {
    Car productCar();
    Engine productEnige();
}
