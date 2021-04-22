package DecoratorPattern;

import DecoratorPattern.ConcreteComponent.ConcreteComponent;
import DecoratorPattern.ConcreteDecorator.ConcreteDecorator;

/**
 * @author yangjun6
 * @date 2021-04-22 15:21
 */
public class Test {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.operation();
    }
}
