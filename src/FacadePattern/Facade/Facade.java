package FacadePattern.Facade;

import FacadePattern.System.SystemA;
import FacadePattern.System.SystemB;
import FacadePattern.System.SystemC;

/**
 * @author yangjun6
 * @date 2021-04-26 15:44
 */
public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;
    public Facade(){
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();
    }
    public void run(){
        systemA.test();
        systemB.test();
        systemC.test();
    }
}
