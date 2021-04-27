package StrategyPattern.ConcreteStrategy;

import StrategyPattern.AbstractStrategy.IStrategy;
import StrategyPattern.Annotation.PriceAnnotion;

/**
 * @author yangjun6
 * @date 2021-04-27 10:39
 */
@PriceAnnotion(max = 2000, min = 1000)
public class StrategyB implements IStrategy {
    @Override
    public void deal() {
        System.out.println("会员价");
    }
}
