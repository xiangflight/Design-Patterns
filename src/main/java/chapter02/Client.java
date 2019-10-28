package chapter02;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/5 10:40 下午
 */

public class Client {

    public static void main(String[] args) {
        invoker();
    }

    private static void invoker() {
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

}
