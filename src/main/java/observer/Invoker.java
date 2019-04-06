package observer;

/**
 * 调用者
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version observer
 * @date 2019-04-06 19:48
 */

public class Invoker {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        IObserver observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.operate();
    }
}
