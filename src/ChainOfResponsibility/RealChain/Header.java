package ChainOfResponsibility.RealChain;

import ChainOfResponsibility.Chain.Chain;
import ChainOfResponsibility.Ratify;
import ChainOfResponsibility.Result;

/**
 * @author yangjun6
 * @date 2021-04-23 14:44
 */
public class Header implements Chain {
    @Override
    public Result deal(Ratify ratify) {
        if(ratify.request().getDay() > 5){
            return ratify.proceed();
        }
        return new Result("部门经理已批");
    }
}
