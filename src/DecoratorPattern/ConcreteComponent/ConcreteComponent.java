package DecoratorPattern.ConcreteComponent;

import DecoratorPattern.Component.Component;

/**
 * @author yangjun6
 * @date 2021-04-22 11:55
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("正常人");
    }
}
