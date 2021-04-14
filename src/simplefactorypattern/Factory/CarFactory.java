package simplefactorypattern.Factory;

import simplefactorypattern.IProduct.Car;
import simplefactorypattern.Product.AudiCar;
import simplefactorypattern.Product.BmwCar;
import simplefactorypattern.Product.XiaoPengCar;

/**
 * @author yangjun6
 * @date 2021-04-13 23:00
 */
public class CarFactory {
     public static Car getCar(String  type){
        if(type.equals("Adui")){
            return new AudiCar();
        }else if(type.equals("Bmw")){
            return new BmwCar();
        }else {
            return new XiaoPengCar();
        }
    }
}
