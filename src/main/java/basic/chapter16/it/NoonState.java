package basic.chapter16.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class NoonState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(String.format("当前时间 %s，饿了午饭：犯困，午休", work.getHour()));
        } else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
