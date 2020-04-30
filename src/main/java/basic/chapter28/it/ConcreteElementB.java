package basic.chapter28.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class ConcreteElementB extends AbstractElement {
    @Override
    protected void accept(AbstractVisitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB() {

    }
}
