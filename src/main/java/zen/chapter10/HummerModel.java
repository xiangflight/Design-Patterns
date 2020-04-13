package zen.chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/14 7:02 上午
 */

public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm() {
        return true;
    }

}
