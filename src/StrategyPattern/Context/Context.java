package StrategyPattern.Context;

import StrategyPattern.AbstractStrategy.IStrategy;

/**
 * @author yangjun6
 * @date 2021-04-27 10:40
 */
public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    public void price(){
        iStrategy.deal();
    }
}
