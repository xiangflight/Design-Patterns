package zen.chapter22;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public class LiSi implements Observer {


    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，汇报");
        this.report(context);
        System.out.println("李斯：汇报完毕...\n");
    }

    private void report(String context) {
        System.out.println("李斯：报告，韩非子有活动了--->" + context);
    }
}
