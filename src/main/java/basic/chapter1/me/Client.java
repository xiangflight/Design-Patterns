package basic.chapter1.me;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class Client {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String operator = scanner.next();

        double result = OperatorFactory.getOperator(operator).operate(a, b);

        // Output
        System.out.println(result);
    }

}
