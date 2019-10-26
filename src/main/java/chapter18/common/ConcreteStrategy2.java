package chapter18.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/26
 */

public class ConcreteStrategy2 implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
