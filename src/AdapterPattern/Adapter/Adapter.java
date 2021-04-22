package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.Adaptee;
import AdapterPattern.Target.Engine;

import java.lang.annotation.Target;

/**
 * @author yangjun6
 * @date 2021-04-22 17:44
 */
public class Adapter implements Engine {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void sport() {
        System.out.println("为五菱宏光适配运动模式");
    }

    @Override
    public void run() {
        adaptee.run();
    }
}
