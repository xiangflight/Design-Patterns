package zen.chapter09;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:19 下午
 */

public abstract class AbstractWhiteHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说话一般都是单字节的");
    }
}
