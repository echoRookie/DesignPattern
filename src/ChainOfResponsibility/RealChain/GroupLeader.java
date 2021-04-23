package ChainOfResponsibility.RealChain;

import ChainOfResponsibility.Chain.Chain;
import ChainOfResponsibility.Ratify;
import ChainOfResponsibility.Result;

/**
 * @author yangjun6
 * @date 2021-04-23 13:59
 */
public class GroupLeader implements Chain {
    @Override
    public Result deal(Ratify ratify) {
      if(ratify.request().getDay() > 1){
            return ratify.proceed();
        }
      return new Result("组长已批");
    }
}
