package ChainOfResponsibility;

import ChainOfResponsibility.Chain.Chain;
import ChainOfResponsibility.RealChain.GroupLeader;
import ChainOfResponsibility.RealChain.Header;
import ChainOfResponsibility.RealChain.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjun6
 * @date 2021-04-23 14:47
 */
public class Client {
    private List<Chain> chainList;
    public Client(){
        chainList = new ArrayList<>();
    }
    public void add(Chain chain){
        chainList.add(chain);
    }
    public Result execute(Request request){
        List<Chain> list = new ArrayList<>();
        list.addAll(chainList);
        list.add(new GroupLeader());
        list.add(new Manager());
        list.add(new Header());
        Ratify ratify = new RealRatify(request, list, 0);
        return list.get(0).deal(ratify);
    }
}
