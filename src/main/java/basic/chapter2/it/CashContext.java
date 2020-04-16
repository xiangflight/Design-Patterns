package basic.chapter2.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 * <p>
 * 必须得有这个Context，持有抽象的 BaseCash 引用
 */

public class CashContext {

    private BaseCash cash;

    /**
     * 用switch没有那么完美，可使用反射进一步优化，使用反射后不用动源码
     *
     * @param type 策略名称
     */
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cash = new NormalCash();
                break;
            case "满300减100":
                cash = new ReturnCash("300", "100");
                break;
            case "打8折":
                cash = new RebateCash("0.8");
                break;
            default:
        }
    }

    public double getResult(double money) {
        return cash.acceptCash(money);
    }

}
