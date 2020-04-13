package basic.chapter6.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    /**
     * 外观
     */
    public void show() {
        System.out.print(" 的装扮");
    }
}
