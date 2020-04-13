package zen.chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/14 7:12 上午
 */

public abstract class AbstractClass {

    protected abstract void doSomething();

    protected abstract void doAnything();

    public void templateMethod() {
        this.doAnything();
        this.doSomething();
    }

}
