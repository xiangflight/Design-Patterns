package observer;

import java.util.Vector;

/**
 * 被观察者：管理并通知观察者
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version strategy
 * @date 2019-04-06 19:32
 */

public abstract class AbstractSubject {

    /**
     * 维护一个观察者的数组，Vector线程同步，安全
     */
    private Vector<IObserver> observers = new Vector<>();

    /**
     * 增加一个观察者
     *
     * @param observer 观察者
     */
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    /**
     * 删除一个观察者
     *
     * @param observer 观察者
     */
    public void delObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    public void notifyObservers() {
        for (IObserver IObserver : observers) {
            IObserver.update();
        }
    }

}
