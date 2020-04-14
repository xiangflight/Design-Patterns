package basic.chapter7.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public class Client {

    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("jiaojiao");

        Proxy daili = new Proxy(jiaojiao);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }

}
