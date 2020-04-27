package basic.chapter19.me;

import org.apache.commons.lang3.StringUtils;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/27
 */

public class HRDepartment extends AbstractCompany {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    protected void add(AbstractCompany company) {

    }

    @Override
    protected void remove(AbstractCompany company) {

    }

    @Override
    protected void display(int depth) {
        System.out.println(StringUtils.repeat('-', depth) + name);
    }

    @Override
    protected void lineOfDuty() {
        System.out.println(String.format("%s 员工招聘培训管理", name));
    }
}
