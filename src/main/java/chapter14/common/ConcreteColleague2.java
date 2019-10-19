package chapter14.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class ConcreteColleague2 extends AbstractColleague {

    public ConcreteColleague2(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {

    }

    public void depMethod2() {
        super.mediator.doSomething2();
    }

}
