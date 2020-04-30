package basic.chapter28.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public abstract class AbstractVisitor {

    /**
     * 访问元素A
     *
     * @param concreteElementA concreteElementA
     */
    protected abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    /**
     * 访问元素B
     *
     * @param concreteElementB concreteElementB
     */
    protected abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}
