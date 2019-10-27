package chapter19.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/27
 */

public class Client {

    public static void main(String[] args) {
        ITarget target = new ConcreteTarget();
        target.request();
        ITarget target2 = new Adapter();
        target2.request();
    }

}
