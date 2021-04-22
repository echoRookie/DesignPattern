package DecoratorPattern.Decorator;

import DecoratorPattern.Component.Component;

/**
 * @author yangjun6
 * @date 2021-04-22 11:58
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
