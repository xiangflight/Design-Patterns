package chapter22;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public class WangSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动...");
        this.cry(context);
        System.out.println("王斯：哭死了...\n");
    }

    private void cry(String context) {
        System.out.println("王斯：因为" + context + "，--所以我悲伤啊！");
    }
}
