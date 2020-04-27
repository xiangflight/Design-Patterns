package basic.chapter19.it;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/27
 */

public class Composite extends AbstractComponent {

    private List<AbstractComponent> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    protected void add(AbstractComponent component) {
        children.add(component);
    }

    @Override
    protected void remove(AbstractComponent component) {
        children.remove(component);
    }

    @Override
    protected void display(int depth) {
        System.out.println(name + " : " + depth);
        children.forEach(component -> component.display(depth + 2));
    }
}
