package SingletonPattern;

/**
 * @author yangjun6
 * @date 2021-04-19 10:24
 * 静态内部类
 */
public class SingletonA {
    private SingletonA(){}
    private static class SingletonHolder{
        public static final SingletonA singletonA = new SingletonA();
    }
    public static SingletonA getInstance(){
        return SingletonHolder.singletonA;
    }
}
