package zen.chapter18.key;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/26
 */

public enum  Calculator {

    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public abstract int exec(int a, int b);

}
