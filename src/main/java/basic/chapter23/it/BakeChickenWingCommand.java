package basic.chapter23.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class BakeChickenWingCommand extends AbstractCommand {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    protected void executeCommand() {
        receiver.bakeChickenWing();
    }
}
