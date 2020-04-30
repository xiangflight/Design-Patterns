package basic.chapter28.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class ConcreteVisitor2 extends AbstractVisitor {
    @Override
    protected void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(String.format("%s被%s访问", concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    protected void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(String.format("%s被%s访问", concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
