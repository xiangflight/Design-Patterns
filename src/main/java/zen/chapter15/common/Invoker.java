package zen.chapter15.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class Invoker {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
