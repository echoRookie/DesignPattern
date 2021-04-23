package ChainOfResponsibility;

import ChainOfResponsibility.Chain.Chain;

import java.util.List;

/**
 * @author yangjun6
 * @date 2021-04-23 14:22
 */
public class RealRatify implements Ratify {
    private Request request;
    private List<Chain> chainList;

    @Override
    public Request request() {
        return request;
    }

    private int index;
    public RealRatify(Request request, List<Chain> chainList, int index){
        this.request = request;
        this.chainList = chainList;
        this.index = index;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public List<Chain> getChainList() {
        return chainList;
    }

    public void setChainList(List<Chain> chainList) {
        this.chainList = chainList;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public Result proceed() {
        Result response = null;
        // 流转到下一级
        if(index < chainList.size()){
            RealRatify realRatify  = new RealRatify(request, chainList, index + 1);
            response = chainList.get(index + 1).deal(realRatify);
        }
        return response;
    }
}
