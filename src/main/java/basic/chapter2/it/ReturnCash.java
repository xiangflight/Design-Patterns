package basic.chapter2.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class ReturnCash extends BaseCash {

    private double condition;

    private double moneyReturn;

    public ReturnCash(String condition, String moneyReturn) {
        this.condition = Double.parseDouble(condition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    double acceptCash(double money) {
        double result = money;
        if (money >= condition) {
            result = money - Math.floor(money / condition) * moneyReturn;
        }
        return result;
    }
}
