package basic.chapter14.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class Client {

    public static void main(String[] args) {
        BaseSubject subject = new Boss();
        IObserver observer1 = new ConcreteObserver1();
        subject.add(observer1);
        IObserver observer2 = new ConcreteObserver2();
        subject.add(observer2);
        subject.update();
    }

}
