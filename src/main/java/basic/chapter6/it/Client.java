package basic.chapter6.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class Client {

    public static void main(String[] args) {
        Person person = new Person("小菜");

        System.out.println("第一种装扮");

        BigTrouser trouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        trouser.decorate(person);
        tShirts.decorate(trouser);
        tShirts.show();
    }

}
