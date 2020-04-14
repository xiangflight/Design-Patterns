package basic.chapter8.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class OperationDiv extends BaseOperation {
    @Override
    double getResult() {
        double result;
        if (b == 0) {
            throw new RuntimeException("除数不能为0");
        }
        result = a / b;
        return result;
    }
}
