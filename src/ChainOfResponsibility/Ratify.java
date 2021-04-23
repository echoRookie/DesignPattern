package ChainOfResponsibility;

/**
 * @author yangjun6
 * @date 2021-04-23 14:20
 * 封装转发逻辑
 */
public interface Ratify {
    Result proceed();
    Request request();
}
