package chapter14;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/18
 */

public class Stock {

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为:" + COMPUTER_NUMBER);
    }



}
