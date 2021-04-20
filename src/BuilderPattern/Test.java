package BuilderPattern;

import BuilderPattern.Builder.CarBuilder;
import BuilderPattern.Director.Director;
import BuilderPattern.Product.Car;

/**
 * @author yangjun6
 * @date 2021-04-20 15:08
 */
public class Test {
    public static void main(String[] args) {
        // 指导类
        Director director = new Director();
        // 建造者类
        CarBuilder carBuilder = new CarBuilder();
        // 指导类开始组装
        director.makeCar(carBuilder);
        Car car =  carBuilder.getCar();


        //链式调用获取c
        Computer dell = new Computer.Builder()
                .setA("A")
                .setB("B")
                .setC("C")
                .builder();
    }
}
