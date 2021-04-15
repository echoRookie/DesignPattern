package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.AbstractFactory.IFactory;
import AbstractFactoryPattern.AbstractProduct.Car;
import AbstractFactoryPattern.AbstractProduct.Engine;
import AbstractFactoryPattern.Product.BmwCar;
import AbstractFactoryPattern.Product.BmwEngine;

/**
 * @author yangjun6
 * @date 2021-04-14 17:46
 */
public class BmwFactory implements IFactory {
    @Override
    public Car productCar() {
        return new BmwCar();
    }

    @Override
    public Engine productEnige() {
        return new BmwEngine();
    }
}
