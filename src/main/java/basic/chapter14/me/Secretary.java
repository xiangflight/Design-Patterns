package basic.chapter14.me;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class Secretary {

    private List<Employee> employees;

    public Secretary() {
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public void updateAll() {
        employees.forEach(Employee::stop);
    }

}
