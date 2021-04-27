package StrategyPattern.ConcreteStrategy;

import StrategyPattern.AbstractStrategy.IStrategy;

/**
 * @author yangjun6
 * @date 2021-04-27 10:39
 */
public class StrategyA implements IStrategy {
    @Override
    public void deal() {
        System.out.println("普通价格");
    }
}
