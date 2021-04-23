package ChainOfResponsibility;

/**
 * @author yangjun6
 * @date 2021-04-23 11:53
 * 定义返回处理的结果类
 */
public class Result {
    private String info;
    public Result(String info){
        this.info = info;
        System.out.println(this.info);
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
