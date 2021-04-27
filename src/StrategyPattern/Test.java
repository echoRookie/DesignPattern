package StrategyPattern;

import StrategyPattern.AbstractStrategy.IStrategy;
import StrategyPattern.ConcreteStrategy.StrategyA;
import StrategyPattern.ConcreteStrategy.StrategyB;
import StrategyPattern.Context.Context;

/**
 * @author yangjun6
 * @date 2021-04-27 10:42
 */
public class Test {
    public static void main(String[] args) {
        Context contextA = new Context(new StrategyA());
        contextA.price();
        Context context = new Context(new StrategyB());
        context.price();
        StrategyFactory strategyFactory = new StrategyFactory();
        IStrategy iStrategy =  strategyFactory.getInstance(1005);
        iStrategy.deal();
    }
}
