package AdapterPattern;

import AdapterPattern.Adaptee.Adaptee;
import AdapterPattern.Adapter.Adapter;

/**
 * @author yangjun6
 * @date 2021-04-22 17:46
 */
public class Test {
    public static void main(String[] args) {
        Adaptee wulingCar = new Adaptee();
        Adapter adapter = new Adapter(wulingCar);
        adapter.run();
        adapter.sport();
    }
}
