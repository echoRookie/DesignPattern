package ProxyPattern.DynamicPattern;

import java.lang.reflect.Proxy;

/**
 * @author yangjun6
 * @date 2021-04-21 14:22
 */
public class JdkProxyFactory {
    public static Object getProxyInstance(Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new DynamicInvocationHandler(target));
    }
}
