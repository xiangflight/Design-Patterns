package basic.chapter19.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/27
 */

public abstract class AbstractComponent {

    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    protected abstract void add(AbstractComponent component);

    protected abstract void remove(AbstractComponent component);

    protected abstract void display(int depth);
}
