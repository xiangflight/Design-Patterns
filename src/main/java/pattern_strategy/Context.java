package pattern_strategy;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version pattern_strategy
 * @date 2019-04-06 11:51
 */

public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doConcreteStrategy() {
        this.strategy.operate();
    }

}
