package basic.chapter14.me;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/16
 */

public abstract class BaseSubject {

    private List<IObserver> observers = new ArrayList<>();

    public void register(IObserver observer) {
        observers.add(observer);
    }

    public void unregister(IObserver observer) {
        observers.remove(observer);
    }

    public void updateAll() {
        observers.forEach(IObserver::update);
    }

}
