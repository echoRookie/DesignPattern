package BuilderPattern;

/**
 * @author yangjun6
 * @date 2021-04-20 15:20
 */
public class Computer {
    private Computer(){}

    private String A;
    private String B;
    private String C;
    public Computer(Builder builder){
        A = builder.getA();
        B = builder.getB();
        C = builder.getC();
    }
    public static class Builder{
        private String A;
        private String B;
        private String C;
        public Builder(){}
        public Builder setA(String a) {
            A = a;
            return this;
        }

        public Builder setB(String b) {
            B = b;
            return this;
        }

        public Builder setC(String c) {
            C = c;
            return this;
        }

        public String getA() {
            return A;
        }

        public String getB() {
            return B;
        }

        public String getC() {
            return C;
        }
        public Computer builder(){
            return new Computer(this);
        }
    }
}
