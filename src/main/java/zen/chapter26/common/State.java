package zen.chapter26.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    protected abstract void handle1();

    protected abstract void handle2();

}
