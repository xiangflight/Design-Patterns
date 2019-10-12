package chapter8;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:15 下午
 */

public class BlackHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("黑人的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂");
    }
}
