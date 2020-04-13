package zen.chapter29;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/6 8:21 上午
 */

public abstract class Corp {

    private AbstractProduct product;

    public Corp(AbstractProduct product) {
        this.product = product;
    }

    public void makeMoney() {
        product.beProducted();
        product.beSelled();
    }

}
