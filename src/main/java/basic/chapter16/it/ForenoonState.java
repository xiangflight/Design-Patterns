package basic.chapter16.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class ForenoonState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println(String.format("当前时间:%s点上午工作，精神百倍", work.getHour()));
        } else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
