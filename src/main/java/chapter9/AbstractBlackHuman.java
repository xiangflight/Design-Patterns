package chapter9;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:20 下午
 */

public abstract class AbstractBlackHuman implements IHuman {

    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种说话，一般人都听不懂");
    }
}
