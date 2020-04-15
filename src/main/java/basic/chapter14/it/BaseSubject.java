package basic.chapter14.it;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public abstract class BaseSubject {

    private List<IObserver> observers = new ArrayList<>();

    /**
     * 添加 observer
     *
     * @param observer observer
     */
    void add(IObserver observer) {
        observers.add(observer);
    }

    /**
     * 移除 observer
     *
     * @param observer observer
     */
    void remove(IObserver observer) {
        observers.remove(observer);
    }

    /**
     * 通知更新
     */
    void update() {
        observers.forEach(IObserver::update);
    }

}
