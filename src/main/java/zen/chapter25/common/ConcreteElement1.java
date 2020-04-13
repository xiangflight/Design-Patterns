package zen.chapter25.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {
        // business operation
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
