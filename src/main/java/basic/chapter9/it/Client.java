package basic.chapter9.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX公司");

        Resume b = a.clone();
        b.setWorkExperience("1998-2006", "YY企业");

        Resume c = a.clone();
        c.setPersonalInfo("男", "24");

        a.display();
        b.display();
        c.display();
    }

}
