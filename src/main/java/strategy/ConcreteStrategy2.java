package strategy;

/**
 * 具体策略2
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version strategy
 * @date 2019-04-06 11:50
 */

public class ConcreteStrategy2 implements IStrategy {
    @Override
    public void operate() {
        System.out.println("operate concrete strategy 2");
    }
}
