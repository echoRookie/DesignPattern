package ChainOfResponsibility;

/**
 * @author yangjun6
 * @date 2021-04-23 11:33
 * 员工请假类
 * 建造者模式
 */
public class Request {
    private String name;
    private int day;
    private String memo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Request(Builder bulider){
        this.name = bulider.name;
        this.day = bulider.day;
        this.memo = bulider.memo;
    }
    public static class Builder{
        private String name;
        private int day;
        private String memo;
        public Builder(){

        }
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getDay() {
            return day;
        }

        public Builder setDay(int day) {
            this.day = day;
            return this;
        }

        public String getMemo() {
            return memo;
        }

        public Builder setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public Request Build(){
            return new Request(this);
        }
    }
}
