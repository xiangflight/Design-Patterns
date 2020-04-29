package basic.chapter23.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class BakeMuttonCommand extends AbstractCommand {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    protected void executeCommand() {
        receiver.bakeMutton();
    }
}
