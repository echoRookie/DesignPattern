package ChainOfResponsibility;

import ChainOfResponsibility.RealChain.CustomerChain;

/**
 * @author yangjun6
 * @date 2021-04-23 15:02
 */
public class Test {
    public static void main(String[] args) {
        Request request = new Request.Builder()
                .setName("张三")
                .setDay(1)
                .setMemo("病假")
                .Build();
        Client client = new Client();
        //增加拦截器
        client.add(new CustomerChain());
        client.execute(request);
    }
}
