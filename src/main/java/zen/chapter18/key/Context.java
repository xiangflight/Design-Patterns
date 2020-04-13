package zen.chapter18.key;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/26
 */

public class Context {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为 " + Arrays.toString(args));
        System.out.println("运行结果为：" + a + symbol + b + "=" + Calculator.ADD.exec(a, b));
    }

}
