package basic.chapter23.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class Client {

    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        AbstractCommand bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        AbstractCommand bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        AbstractCommand bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        girl.setOrder(bakeMuttonCommand1);
        girl.notice();

        girl.setOrder(bakeMuttonCommand2);
        girl.notice();

        girl.setOrder(bakeChickenWingCommand1);
        girl.notice();
    }

}
