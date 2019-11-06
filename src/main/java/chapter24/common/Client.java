package chapter24.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/6
 */

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        caretaker.setMemento(originator.createMemento());

        originator.restoreMemento(caretaker.getMemento());
    }

}
