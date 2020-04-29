package basic.chapter23.it;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class Waiter {

    private List<AbstractCommand> orders = new ArrayList<>();

    private AbstractCommand command;

    public void setOrder(AbstractCommand command) {
        this.command = command;
    }

    public void notice() {
        command.executeCommand();
    }

}
