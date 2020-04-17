package basic.chapter17.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class ForeignCenter  {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingong() {
        System.out.println(String.format("外籍中锋 %s 进攻", name));
    }

    public void fangshou() {
        System.out.println(String.format("外籍中锋 %s 防守", name));
    }
}
