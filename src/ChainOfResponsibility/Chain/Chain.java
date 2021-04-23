package ChainOfResponsibility.Chain;

import ChainOfResponsibility.Ratify;
import ChainOfResponsibility.Result;

/**
 * @author yangjun6
 * @date 2021-04-23 11:54
 * 定义抽象职责链
 */
public interface Chain {
    Result deal(Ratify ratify);
}
