package zen.chapter18.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/26
 */

public class Client {

    public static void main(String[] args) {
        IStrategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
    }

}
