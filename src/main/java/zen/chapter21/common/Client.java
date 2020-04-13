package zen.chapter21.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/30
 */

public class Client {

    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();

        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Composite root) {
        for (Component c: root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display((Composite) c);
            }
        }
    }

}
