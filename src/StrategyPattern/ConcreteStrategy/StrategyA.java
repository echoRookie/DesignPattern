package StrategyPattern.ConcreteStrategy;

import StrategyPattern.AbstractStrategy.IStrategy;
import StrategyPattern.Annotation.PriceAnnotion;

/**
 * @author yangjun6
 * @date 2021-04-27 10:39
 */
@PriceAnnotion(max = 1000, min = 0)
public class StrategyA implements IStrategy {
    @Override
    public void deal() {
        System.out.println("普通价格");
    }
}
