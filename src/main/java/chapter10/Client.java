package chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/14 7:08 上午
 */

public class Client {

    public static void main(String[] args) {
//        HummerModel h1 = new HummerH1Model();
//        h1.run();
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        class1.templateMethod();
        class2.templateMethod();
    }

}
