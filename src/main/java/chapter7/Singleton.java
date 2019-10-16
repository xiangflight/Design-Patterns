package chapter7;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 9:56 下午
 */

public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void doSomething() {
    }

}
