package zen.chapter14.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class ConcreteMediator extends AbstractMediator {
    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
