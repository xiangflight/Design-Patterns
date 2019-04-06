package pattern_strategy;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version pattern_strategy
 * @date 2019-04-06 11:53
 */

public class Invoker {

    public static void main(String[] args) {
        IStrategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doConcreteStrategy();
    }

}
