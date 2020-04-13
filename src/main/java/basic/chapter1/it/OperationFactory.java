package basic.chapter1.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class OperationFactory {

    public static BaseOperation createOperation(String operator) {
        BaseOperation operation = null;
        switch (operator) {
            case "+":
                operation =  new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
        }
        return operation;
    }

}
