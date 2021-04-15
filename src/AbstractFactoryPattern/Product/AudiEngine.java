package AbstractFactoryPattern.Product;

import AbstractFactoryPattern.AbstractProduct.Engine;

/**
 * @author yangjun6
 * @date 2021-04-14 17:43
 */
public class AudiEngine implements Engine {
    @Override
    public void start() {
        System.out.println("奥迪发动机");
    }
}
