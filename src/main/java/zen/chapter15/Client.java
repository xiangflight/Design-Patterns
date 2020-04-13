package zen.chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class Client {

    public static void main(String[] args) {
        System.out.println("-----客户要求增加一项需求-----");
        AbstractGroup rg = new RequirementGroup();
        rg.find();
        rg.add();
        rg.add();
    }

}
