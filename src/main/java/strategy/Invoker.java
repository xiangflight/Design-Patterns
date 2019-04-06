package strategy;

/**
 * 调用者
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version strategy
 * @date 2019-04-06 11:53
 */

public class Invoker {

    public static void main(String[] args) {
        // invoke common strategy code
        IStrategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doConcreteStrategy();
        System.out.println();
        // invoke strategy enum
        int a = 1, b = 2;
        System.out.println("strategy enum result is " + Calculator.ADD.exec(a, b));
    }

}
