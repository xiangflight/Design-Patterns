package chapter04;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/9 10:07 下午
 */

public abstract class AbstractSearcher {

    protected IPrettyGirl prettyGirl;

    public AbstractSearcher(IPrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }

    public abstract void show();

}
