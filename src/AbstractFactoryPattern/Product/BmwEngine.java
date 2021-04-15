package AbstractFactoryPattern.Product;

import AbstractFactoryPattern.AbstractProduct.Engine;

/**
 * @author yangjun6
 * @date 2021-04-14 17:44
 */
public class BmwEngine implements Engine {
    @Override
    public void start() {
        System.out.println("宝马发动机");
    }
}
