package basic.chapter2.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 * <p>
 * 正常收费子类
 */

public class NormalCash extends BaseCash {
    @Override
    double acceptCash(double money) {
        return money;
    }
}
