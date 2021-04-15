package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.AbstractFactory.IFactory;
import AbstractFactoryPattern.AbstractProduct.Car;
import AbstractFactoryPattern.AbstractProduct.Engine;
import AbstractFactoryPattern.Product.AudiCar;
import AbstractFactoryPattern.Product.AudiEngine;

/**
 * @author yangjun6
 * @date 2021-04-14 17:45
 */
public class AudiFactory implements IFactory {
    @Override
    public Car productCar() {
        return new AudiCar();
    }

    @Override
    public Engine productEnige() {
        return new AudiEngine();
    }
}
