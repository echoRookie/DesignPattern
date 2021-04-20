package BuilderPattern.Builder;

import BuilderPattern.AbstractBuilder.AbstractCarBuilder;
import BuilderPattern.Product.Car;

/**
 * @author yangjun6
 * @date 2021-04-20 14:51
 */
public class CarBuilder extends AbstractCarBuilder {
    private Car car;
    public CarBuilder(){
        car = new Car();
    }
    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTyre(String tyre) {
        car.setTyre(tyre);
    }

    @Override
    public void setSystem(String system) {
        car.setSystem(system);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
