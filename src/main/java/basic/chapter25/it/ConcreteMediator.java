package basic.chapter25.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class ConcreteMediator extends AbstractMediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, AbstractColleague colleague) {
        if (colleague.equals(colleague1)) {
            colleague2.notice(message);
        } else {
            colleague1.notice(message);
        }
    }
}
