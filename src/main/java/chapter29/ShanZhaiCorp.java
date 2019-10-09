package chapter29;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/6 8:58 上午
 */

public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(AbstractProduct product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱啊...");
    }
}
