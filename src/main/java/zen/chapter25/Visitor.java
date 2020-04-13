package zen.chapter25;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class Visitor implements IVisitor {

    private final static int MANAGER_COEFFICIENT = 5;

    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    private int commonTotalSalary = 0;

    private int managerTotalSalary = 0;

    private void calManagerSalary(int salary) {
        this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
    }

    private void calCommonSalary(int salary) {
        this.commonTotalSalary += salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    private String getBasicInfo(AbstractEmployee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info += "性别：" + (employee.getSex() == AbstractEmployee.FEMALE? "女": "男") + "\t";
        info += "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        calManagerSalary(manager.getSalary());
        return getBasicInfo(manager) + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        calCommonSalary(commonEmployee.getSalary());
        return getBasicInfo(commonEmployee) + otherInfo;
    }
}
