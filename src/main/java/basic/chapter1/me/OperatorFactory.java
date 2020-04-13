package basic.chapter1.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class OperatorFactory {

    public static BaseOperator getOperator(String operator) {
        switch (operator) {
            case "+":
                return new AddOperator();
            case "-":
                return new SubtractOperator();
            case "*":
                return new MultiplyOperator();
            case "/":
                return new DivideOperator();
            default:
                throw new UnsupportedOperationException("不支持的运算");
        }
    }

}
