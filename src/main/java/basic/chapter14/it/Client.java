package basic.chapter14.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class Client {

    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.add(new ConcreteObserver1(boss, "X"));
        boss.add(new ConcreteObserver1(boss, "Y"));
        boss.add(new ConcreteObserver1(boss, "Z"));

        boss.setState("ABC");
        boss.update();
    }

}
