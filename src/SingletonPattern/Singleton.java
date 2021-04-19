package SingletonPattern;

/**
 * @author yangjun6
 * @date 2021-04-19 10:14
 * 饿汉式
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
}
