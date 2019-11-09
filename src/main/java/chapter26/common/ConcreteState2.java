package chapter26.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class ConcreteState2 extends State{

    @Override
    protected void handle1() {
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    protected void handle2() {
        // handle logic
    }
}
