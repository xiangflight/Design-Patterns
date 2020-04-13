package zen.chapter08;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:16 下午
 */

public class WhiteHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色都是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节");
    }
}
