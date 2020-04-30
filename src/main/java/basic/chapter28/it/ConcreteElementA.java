package basic.chapter28.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class ConcreteElementA extends AbstractElement {
    @Override
    protected void accept(AbstractVisitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {}
}
