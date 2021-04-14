package factorymethodpattern.product;


import factorymethodpattern.AbstractProduct.Car;

/**
 * @author yangjun6
 * @date 2021-04-13 22:55
 */
public class XiaoPengCar implements Car {
    @Override
    public void run() {
        System.out.println("我是小鹏电动车");
    }
}
