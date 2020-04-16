package basic.chapter16.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/16
 */

public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println(String.format("当前时间 %s 点，上午工作，精神百倍", work.getHour()));
        } else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
