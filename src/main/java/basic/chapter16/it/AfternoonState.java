package basic.chapter16.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class AfternoonState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println(String.format("当前时间：%s 点下午状态还不错，继续努力", work.getHour()));
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
