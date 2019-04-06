package observer;

/**
 * 具体的观察者：定义观察者自身的处理逻辑
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version observer
 * @date 2019-04-06 19:46
 */

public class ConcreteObserver implements IObserver {

    @Override
    public void update() {
        System.out.println("收到消息，并进行处理！！！");
    }
}
