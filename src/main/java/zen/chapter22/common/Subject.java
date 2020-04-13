package zen.chapter22.common;

import java.util.Vector;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public abstract class Subject {

    private Vector<Observer> observerVector = new Vector<>();

    public void addObserver(Observer observer) {
        observerVector.add(observer);
    }

    public void delObserver(Observer observer) {
        observerVector.remove(observer);
    }

    public void notifyObservers() {
        observerVector.forEach(Observer::update);
    }

}
