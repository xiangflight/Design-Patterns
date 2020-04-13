package zen.chapter25.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public interface IVisitor {

    void visit(ConcreteElement1 el1);

    void visit(ConcreteElement2 el2);

}
