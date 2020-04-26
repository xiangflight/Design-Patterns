package basic.chapter18.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class Client {

    public static void main(String[] args) {
        Role role = new Role();
        Property before = new Property(role.getProperty());
        role.fightWithBoss();
        role.showProperty();
        role.setProperty(before);
        role.showProperty();
    }

}
