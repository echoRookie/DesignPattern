package BuilderPattern.Director;

import BuilderPattern.AbstractBuilder.AbstractCarBuilder;
import BuilderPattern.Product.Car;

/**
 * @author yangjun6
 * @date 2021-04-20 15:06
 */
public class Director {
    public void makeCar(AbstractCarBuilder abstractCarBuilder){
        abstractCarBuilder.setEngine("本田发动机");
        abstractCarBuilder.setTyre("轮胎");
        abstractCarBuilder.setSystem("车载系统");
    }
}
