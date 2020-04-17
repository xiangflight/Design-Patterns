package basic.chapter17.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class Client {

    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();
        Player m = new Guards("麦迪");
        m.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }

}
