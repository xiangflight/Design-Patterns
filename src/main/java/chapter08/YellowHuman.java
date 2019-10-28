package chapter08;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:16 下午
 */

public class YellowHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节");
    }
}
