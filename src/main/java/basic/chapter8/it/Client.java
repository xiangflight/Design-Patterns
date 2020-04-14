package basic.chapter8.it;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            String operator = scanner.next();

            IFactory addFactory = new AddFactory();
            BaseOperation operation = addFactory.createOperation();
            operation.setA(a);
            operation.setB(b);
            // Output
            System.out.println("结果是：" + operation.getResult());
        } catch (UnsupportedOperationException e) {
            System.out.println("您的输入有误：" + e.getMessage());
        }
    }

}
