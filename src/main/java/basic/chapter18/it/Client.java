package basic.chapter18.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/26
 */

public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();
    }

}
