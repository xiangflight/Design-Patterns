package strategy;

/**
 * 策略枚举
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version strategy
 * @date 2019-04-06 18:33
 */

public enum  Calculator {
    // add calculator
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    // sub calculator
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private String symbol;

    Calculator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    /**
     * 需要实现的抽象策略
     *
     * @param a 参数a
     * @param b 参数b
     * @return 算法计算后的返回值
     */
    public abstract int exec(int a, int b);
}
