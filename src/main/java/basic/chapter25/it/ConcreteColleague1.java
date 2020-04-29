package basic.chapter25.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class ConcreteColleague1 extends AbstractColleague {

    public ConcreteColleague1(AbstractMediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notice(String message) {
        System.out.println("同事1得到消息:" + message);
    }
}
