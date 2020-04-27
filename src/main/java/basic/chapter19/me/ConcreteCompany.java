package basic.chapter19.me;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/27
 */

public class ConcreteCompany extends AbstractCompany {

    private List<AbstractCompany> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    protected void add(AbstractCompany company) {
        children.add(company);
    }

    @Override
    protected void remove(AbstractCompany company) {
        children.remove(company);
    }

    @Override
    protected void display(int depth) {
        System.out.println(StringUtils.repeat('-', depth) + name);
        for (AbstractCompany company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    protected void lineOfDuty() {
        for (AbstractCompany company : children) {
            company.lineOfDuty();
        }
    }
}
