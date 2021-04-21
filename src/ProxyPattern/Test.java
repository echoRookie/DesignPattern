package ProxyPattern;

import ProxyPattern.ProxySubject.ProxyAudiCar;
import ProxyPattern.RealSubject.AudiCar;

/**
 * @author yangjun6
 * @date 2021-04-21 11:43
 */
public class Test {
    public static void main(String[] args) {
        AudiCar audiCar = new AudiCar();
        ProxyAudiCar proxyAudiCar = new ProxyAudiCar(audiCar);
        proxyAudiCar.start();
    }
}
