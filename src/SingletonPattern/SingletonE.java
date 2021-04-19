package SingletonPattern;

/**
 * @author yangjun6
 * @date 2021-04-19 11:02
 * 双重检验锁
 */
public class SingletonE {
    private SingletonE(){}
    private volatile static SingletonE singletonE;
    public static SingletonE getInstance(){
        if(singletonE == null){
            synchronized (SingletonE.class){
                if(singletonE == null){
                    singletonE = new SingletonE();
                }
            }
        }
        return singletonE;
    }
}
