package SingletonPattern;

/**
 * @author yangjun6
 * @date 2021-04-19 10:36
 * 懒汉式，线程不安全
 */
public class SingletonC {
    private SingletonC(){}
    private static SingletonC singletonC;
    public static SingletonC  getInstance(){
        if(singletonC == null){
            singletonC = new SingletonC();
        }
        return singletonC;
    }

}
