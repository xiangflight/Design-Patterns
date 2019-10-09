package chapter29;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/6 9:02 上午
 */

public class Clothes extends AbstractProduct {
    @Override
    public void beProducted() {
        System.out.println("生产出的衣服是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }
}
