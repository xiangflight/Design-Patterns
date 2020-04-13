package zen.chapter22.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
}
