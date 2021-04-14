package factorymethodpattern.factory;

import factorymethodpattern.AbstractFactory.Factory;
import factorymethodpattern.AbstractProduct.Car;
import factorymethodpattern.product.AudiCar;
import factorymethodpattern.product.BmwCar;

/**
 * @author yangjun6
 * @date 2021-04-14 11:49
 */
public class AudiFactory implements Factory {
    @Override
    public Car productCar() {
        return new AudiCar();
    }
}
