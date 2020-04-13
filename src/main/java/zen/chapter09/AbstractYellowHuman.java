package zen.chapter09;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:21 下午
 */

public abstract class AbstractYellowHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话一般都是双字节的");
    }
}
