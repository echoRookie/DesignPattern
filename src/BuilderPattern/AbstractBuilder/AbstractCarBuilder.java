package BuilderPattern.AbstractBuilder;

import BuilderPattern.Product.Car;

/**
 * @author yangjun6
 * @date 2021-04-20 14:47
 */
public abstract class AbstractCarBuilder {
    public abstract void setEngine(String engine);
    public abstract void setTyre(String tyre);
    public abstract void setSystem(String system);
    public abstract Car getCar();
}
