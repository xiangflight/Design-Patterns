package basic.chapter14.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class ConcreteObserver1 implements IObserver {
    @Override
    public void update() {
        System.out.println("具体的被通知者1执行行为");
    }
}
