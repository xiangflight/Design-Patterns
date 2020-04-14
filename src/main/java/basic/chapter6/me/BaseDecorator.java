package basic.chapter6.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public abstract class BaseDecorator extends Person {

    private Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
