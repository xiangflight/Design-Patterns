package basic.chapter13.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class ConcreteBuilder1 extends BaseBuilder {

    private Product product = new Product();

    @Override
    void buildPartA() {
        product.add("部件 A");
    }

    @Override
    void buildPartB() {
        product.add("部件 B");
    }

    @Override
    Product createProduct() {
        return product;
    }
}
