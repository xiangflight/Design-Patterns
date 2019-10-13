package chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/14 7:03 上午
 */

public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    @Override
    protected void start() {
        System.out.println("悍马H1发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }
}
