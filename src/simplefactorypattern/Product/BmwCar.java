package simplefactorypattern.Product;

import simplefactorypattern.IProduct.Car;

/**
 * @author yangjun6
 * @date 2021-04-13 22:53
 */
public class BmwCar implements Car {
    @Override
    public void run() {
        System.out.println("我是宝马");
    }
}
