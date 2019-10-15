package chapter11;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/15 7:57 下午
 */

public class ConcreteBuilder extends Builder {

    private Product product = new Product();


    @Override
    public void setPart() {
        // logic
    }

    @Override
    public Product buildProduct() {
        return this.product;
    }
}
