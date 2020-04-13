package zen.chapter25;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

    int getTotalSalary();

}
