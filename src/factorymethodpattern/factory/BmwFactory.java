package factorymethodpattern.factory;

import factorymethodpattern.AbstractFactory.Factory;
import factorymethodpattern.AbstractProduct.Car;
import factorymethodpattern.product.BmwCar;

/**
 * @author yangjun6
 * @date 2021-04-14 11:53
 */
public class BmwFactory implements Factory {
    @Override
    public Car productCar() {
        return new BmwCar();
    }
}
