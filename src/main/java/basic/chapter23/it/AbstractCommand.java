package basic.chapter23.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public abstract class AbstractCommand {

    protected Barbecuer receiver;

    public AbstractCommand(Barbecuer receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行具体的命令
     */
    protected abstract void executeCommand();


}
