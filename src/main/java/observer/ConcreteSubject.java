package observer;

/**
 * 具体的被观察者：定义自身的业务逻辑，
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version observer
 * @date 2019-04-06 19:42
 */

public class ConcreteSubject extends AbstractSubject {

    public void operate() {
        System.out.println("concrete subject operate");
        super.notifyObservers();
    }

}
