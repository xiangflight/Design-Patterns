package basic.chapter16.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class EveningState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinished()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println(String.format("当前时间：%s 点加班，疲惫至极", work.getHour()));
            } else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
