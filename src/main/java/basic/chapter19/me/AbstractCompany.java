package basic.chapter19.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/27
 */

public abstract class AbstractCompany {

    protected String name;

    public AbstractCompany(String name) {
        this.name = name;
    }

    protected abstract void add(AbstractCompany company);

    protected abstract void remove(AbstractCompany company);

    protected abstract void display(int depth);

    protected abstract void lineOfDuty();
}
