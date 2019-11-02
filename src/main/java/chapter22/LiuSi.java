package chapter22;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public class LiuSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了...");
        this.happy(context);
        System.out.println("刘斯：乐死了...\n");
    }

    private void happy(String context) {
        System.out.println("刘斯：因为" + context + "，--所以我快乐呀！");
    }
}
