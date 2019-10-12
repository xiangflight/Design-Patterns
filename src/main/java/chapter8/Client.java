package chapter8;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:30 下午
 */

public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
    }

}
