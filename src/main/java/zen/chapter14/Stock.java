package zen.chapter14;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/18
 */

public class Stock extends AbstractColleague {

    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number) {
        COMPUTER_NUMBER += number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public void decrease(int number) {
        COMPUTER_NUMBER -= number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        System.out.println("清理存货数量：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }

}
