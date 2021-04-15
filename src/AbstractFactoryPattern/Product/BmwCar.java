package AbstractFactoryPattern.Product;

import AbstractFactoryPattern.AbstractProduct.Car;

/**
 * @author yangjun6
 * @date 2021-04-14 17:43
 */
public class BmwCar implements Car {
    @Override
    public void run() {
        System.out.println("生产宝马汽车");
    }
}
