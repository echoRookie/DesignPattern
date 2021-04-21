package ProxyPattern.DynamicPattern;

import BuilderPattern.Product.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yangjun6
 * @date 2021-04-21 14:11
 */
public class DynamicInvocationHandler implements InvocationHandler {
    private final Object target;
    public DynamicInvocationHandler(Object target){
       this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前" + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("调用后" + method.getName());
        return result;
    }
}
