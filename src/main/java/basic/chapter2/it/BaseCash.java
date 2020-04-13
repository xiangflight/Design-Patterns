package basic.chapter2.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public abstract class BaseCash {
    /**
     * 抽象方法，表示收银
     * @param money 应该收银
     * @return 实际收银
     */
    abstract double acceptCash(double money);

}
