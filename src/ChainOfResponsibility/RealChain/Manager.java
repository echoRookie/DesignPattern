package ChainOfResponsibility.RealChain;

import ChainOfResponsibility.Chain.Chain;
import ChainOfResponsibility.Ratify;
import ChainOfResponsibility.Result;

/**
 * @author yangjun6
 * @date 2021-04-23 14:43
 */
public class Manager implements Chain {
    @Override
    public Result deal(Ratify ratify) {
        if(ratify.request().getDay() > 3){
            return ratify.proceed();
        }
        return new Result("项目经理已批");
    }
}
