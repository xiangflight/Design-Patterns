package chapter25;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class Client {

    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        for (AbstractEmployee employee: mockEmployee()) {
            employee.accept(visitor);
        }
        System.out.println("本公司的月工资总额是：" + visitor.getTotalSalary());
    }

    public static List<AbstractEmployee> mockEmployee() {
        List<AbstractEmployee> empList = new ArrayList<>();
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写 Java 程序");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(AbstractEmployee.MALE);
        empList.add(zhangSan);
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本是负值，但是会拍马屁");
        wangWu.setSalary(18750);
        wangWu.setSex(AbstractEmployee.MALE);
        empList.add(wangWu);
        return empList;
    }

}
