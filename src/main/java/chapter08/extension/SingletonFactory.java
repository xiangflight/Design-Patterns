package chapter08.extension;

import java.lang.reflect.Constructor;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:09 下午
 */

public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class cls = Class.forName(Singleton.class.getName());
            Constructor constructor = cls.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            // handle exception
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }

}
