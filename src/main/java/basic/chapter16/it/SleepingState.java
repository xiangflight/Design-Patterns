package basic.chapter16.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class SleepingState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s 点不行了，睡着了", work.getHour()));
    }
}
