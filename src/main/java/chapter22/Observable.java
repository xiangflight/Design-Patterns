package chapter22;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(String context);

}
