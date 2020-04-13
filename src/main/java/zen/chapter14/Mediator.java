package zen.chapter14;

import java.util.Objects;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (Objects.equals("purchase.buy", str)) {
            this.buyComputer((Integer) objects[0]);
        } else if (Objects.equals("sale.sell", str)) {
            this.sellComputer((Integer) objects[0]);
        } else if (Objects.equals("sale.offsell", str)) {
            this.offSell();
        } else if (Objects.equals("stock.clear", str)) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑" + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
