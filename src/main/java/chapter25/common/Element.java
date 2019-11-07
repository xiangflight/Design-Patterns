package chapter25.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public abstract class Element {

    public abstract void doSomething();

    public abstract void accept(IVisitor visitor);

}
