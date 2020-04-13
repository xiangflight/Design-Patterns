package zen.chapter24.common.clone;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/6
 */

public class Originator implements Cloneable {
    private Originator backup;

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        backup = this.clone();
    }

    public void restoreMemento() {
        this.setState(this.backup.getState());
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
