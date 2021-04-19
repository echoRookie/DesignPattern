package SingletonPattern;

/**
 * @author yangjun6
 * @date 2021-04-19 10:48
 * 懒汉式线程安全
 */
public class SingletonD {
    private static SingletonD singletonD;
    private SingletonD(){}
    public static synchronized SingletonD getInstance(){
        if(singletonD == null){
            singletonD = new SingletonD();
            return singletonD;
        }
        return singletonD;
    }
}
