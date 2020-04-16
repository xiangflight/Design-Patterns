package basic.chapter14.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class ConcreteObserver1 implements IObserver {

    private String name;
    private String state;
    private Boss subject;

    public ConcreteObserver1(Boss subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        state = subject.getState();
        System.out.println(String.format("观察者%s的新状态是%s", name, state));
    }
}
