package simplefactorypattern.Factory;

import simplefactorypattern.IProduct.Car;
import simplefactorypattern.Product.AudiCar;
import simplefactorypattern.Product.BmwCar;
import simplefactorypattern.Product.XiaoPengCar;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangjun6
 * @date 2021-04-13 23:08
 */
public class CarMapFactory {
    private static Map<String, Car> map = new HashMap<>();

    static {
        map.put("Audi", new AudiCar());
        map.put("Bmw", new BmwCar());
        map.put("XiaoPeng", new XiaoPengCar());
    }
    public static Car getCar(String type){
        return map.get(type);
    }
}
