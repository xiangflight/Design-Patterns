package chapter18.extension;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/26
 */

public class Context {

    private ICalculator calculator;

    public Context(ICalculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b, String symbol) {
        return this.calculator.exec(a, b);
    }

}
