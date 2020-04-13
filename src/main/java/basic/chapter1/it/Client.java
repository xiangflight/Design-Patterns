package basic.chapter1.it;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            String operator = scanner.next();

            BaseOperation operation = OperationFactory.createOperation(operator);
            operation.setA(a);
            operation.setB(b);
            // Output
            System.out.println("结果是：" + operation.getResult());
        } catch (UnsupportedOperationException e) {
            System.out.println("您的输入有误：" + e.getMessage());
        }
    }

}
