package chapter14.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class ConcreteColleague1 extends AbstractColleague {

    public ConcreteColleague1(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {

    }

    public void depMethod1() {
        super.mediator.doSomething1();
    }
}
