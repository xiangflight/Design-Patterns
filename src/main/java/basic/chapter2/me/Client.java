package basic.chapter2.me;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 *
 * 好吧，这题似曾相识
 */

public class Client {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();

        double total = price * quantity;
        // Output
        System.out.println("总价是：" + total);
    }

}
