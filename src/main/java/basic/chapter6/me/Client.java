package basic.chapter6.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public class Client {

    public static void main(String[] args) {
        Person person = new Person("Davis");
        BaseDecorator trouser = new Trouser();
        trouser.decorate(person);
        BaseDecorator shirt = new TShirt();
        shirt.decorate(trouser);
        shirt.show();
    }

}
