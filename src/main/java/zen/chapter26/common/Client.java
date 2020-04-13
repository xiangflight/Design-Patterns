package zen.chapter26.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
    }

}
