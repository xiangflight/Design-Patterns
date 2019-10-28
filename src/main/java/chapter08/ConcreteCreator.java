package chapter08;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:29 下午
 */

public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // exception handle
        }
        return (T) product;
    }
}
