package chapter19.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/27
 */

public class Adapter extends Adaptee implements ITarget {
    @Override
    public void request() {
        super.doSomething();
    }
}
