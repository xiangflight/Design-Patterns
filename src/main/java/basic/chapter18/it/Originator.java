package basic.chapter18.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/26
 */

public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public void show() {
        System.out.println("State=" + state);
    }

}
