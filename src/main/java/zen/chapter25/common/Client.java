package zen.chapter25.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element e1 = ObjectStructure.createElement();
            e1.accept(new Visitor());
        }
    }

}
