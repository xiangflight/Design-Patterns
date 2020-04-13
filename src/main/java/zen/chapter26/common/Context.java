package zen.chapter26.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class Context {

    public static final State STATE1 = new ConcreteState1();
    public static final State STATE2 = new ConcreteState2();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }
}
