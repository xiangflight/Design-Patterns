package zen.chapter11;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/15 7:59 下午
 */

public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getProduct() {
        builder.setPart();
        return builder.buildProduct();
    }

}
