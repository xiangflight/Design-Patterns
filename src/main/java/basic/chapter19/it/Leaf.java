package basic.chapter19.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/27
 */

public class Leaf extends AbstractComponent {

    public Leaf(String name) {
        super(name);
    }

    @Override
    protected void add(AbstractComponent component) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    protected void remove(AbstractComponent component) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    protected void display(int depth) {
        System.out.println(name + " : " + depth);
    }
}
