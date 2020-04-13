package basic.chapter2.it;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class Client {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();

        CashContext cashContext = new CashContext(type);
        double total = 0.0d;
        double result = cashContext.getResult(price * quantity);
        total += result;
        // Output
        System.out.println("总金额是" + total);
    }

}
