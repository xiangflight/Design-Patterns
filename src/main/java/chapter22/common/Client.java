package chapter22.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        subject.addObserver(obs);
        subject.doSomething();
    }

}
