package chapter26.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class ConcreteState1 extends State {

    @Override
    protected void handle1() {
        // handle1
    }

    @Override
    protected void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
