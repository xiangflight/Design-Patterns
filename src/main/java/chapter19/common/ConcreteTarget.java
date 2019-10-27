package chapter19.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/27
 */

public class ConcreteTarget implements ITarget {
    @Override
    public void request() {
        System.out.println("if you need any help, pls call me!");
    }
}
