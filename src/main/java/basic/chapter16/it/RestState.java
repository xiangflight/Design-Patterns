package basic.chapter16.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class RestState extends AbstractState{
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s 点下班回家了", work.getHour()));
    }
}
