package basic.chapter2.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class RebateCash extends BaseCash {

    private double rebate = 1d;

    public RebateCash(String rebate) {
        this.rebate = Double.parseDouble(rebate);
    }

    @Override
    double acceptCash(double money) {
        return money * rebate;
    }
}
