package DecoratorPattern.ConcreteDecorator;

import DecoratorPattern.Component.Component;
import DecoratorPattern.Decorator.Decorator;

/**
 * @author yangjun6
 * @date 2021-04-22 15:16
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("包装一层first");
        super.operation();
        System.out.println("包装一层last");
    }
}
