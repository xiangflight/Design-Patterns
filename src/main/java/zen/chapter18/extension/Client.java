package zen.chapter18.extension;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/26
 */

public class Client {

    public final static String ADD_SYMBOL = "+";
    public final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b= Integer.parseInt(args[2]);
        System.out.println("输入的参数为" + Arrays.toString(args));
        Context context = null;
        if (Objects.equals(ADD_SYMBOL, symbol)) {
            context = new Context(new Add());
        } else if (Objects.equals(SUB_SYMBOL, symbol)) {
            context = new Context(new Sub());
        }
        System.out.println("运行结果为：" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }

}
