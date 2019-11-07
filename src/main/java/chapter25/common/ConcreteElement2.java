package chapter25.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class ConcreteElement2 extends Element {
    @Override
    public void doSomething() {
        // business ops
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
