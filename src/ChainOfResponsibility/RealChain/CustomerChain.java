package ChainOfResponsibility.RealChain;

import ChainOfResponsibility.Chain.Chain;
import ChainOfResponsibility.Ratify;
import ChainOfResponsibility.Result;

/**
 * @author yangjun6
 * @date 2021-04-23 15:19
 */
public class CustomerChain implements Chain {
    @Override
    public Result deal(Ratify ratify) {
        if(ratify.request() != null){
            System.out.println("信息员已阅");
            return ratify.proceed();
        }
        return new Result("信息有问题重新填写");
    }
}
