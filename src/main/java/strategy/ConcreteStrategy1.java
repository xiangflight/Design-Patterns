package strategy;

/**
 * 具体策略1
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version strategy
 * @date 2019-04-06 11:49
 */

public class ConcreteStrategy1 implements IStrategy {
    @Override
    public void operate() {
        System.out.println("operate concrete strategy 1");
    }
}
