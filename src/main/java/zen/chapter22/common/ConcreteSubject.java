package zen.chapter22.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public class ConcreteSubject extends Subject{

    public void doSomething() {
        super.notifyObservers();
    }

}
