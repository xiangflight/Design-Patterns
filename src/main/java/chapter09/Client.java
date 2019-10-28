package chapter09;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:40 下午
 */

public class Client {

    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA a1 = creator1.createProductA();
        AbstractProductA a2 = creator2.createProductA();

        AbstractProductB b1 = creator1.createProductB();
        AbstractProductB b2 = creator2.createProductB();
    }

}
