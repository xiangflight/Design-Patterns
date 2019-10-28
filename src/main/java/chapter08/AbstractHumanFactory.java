package chapter08;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:18 下午
 */

public abstract class AbstractHumanFactory {

    /**
     * 创建人类
     *
     * @param c   具体人种
     * @param <T> IHuman 的实现类
     * @return
     */
    public abstract <T extends IHuman> T createHuman(Class<T> c);

}
