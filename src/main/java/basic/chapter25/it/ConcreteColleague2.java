package basic.chapter25.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class ConcreteColleague2 extends AbstractColleague {

    public ConcreteColleague2(AbstractMediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notice(String message) {
        System.out.println("同事2得到消息：" + message);
    }
}
