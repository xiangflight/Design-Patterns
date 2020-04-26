package basic.chapter18.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class Role {

    private Property property;

    public Role() {
        property = new Property(100, 100, 100);
    }

    public Property getProperty() {
        return property;
    }

    public void fightWithBoss() {
        System.out.println("flight with boss");
        property.setLife(80);
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public void showProperty() {
        System.out.println(property);
    }
}
