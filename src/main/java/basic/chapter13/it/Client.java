package basic.chapter13.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        BaseBuilder b1 = new ConcreteBuilder1();
        BaseBuilder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product p1 = b1.createProduct();
        p1.show();

        director.construct(b2);
        Product p2 = b2.createProduct();
        p2.show();
    }

}
