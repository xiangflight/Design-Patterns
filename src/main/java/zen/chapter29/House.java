package zen.chapter29;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/6 8:52 上午
 */

public class House extends AbstractProduct {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
