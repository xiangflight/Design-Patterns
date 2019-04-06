package strategy;

/**
 * 上下文环境
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version strategy
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
