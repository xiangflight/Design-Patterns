package zen.chapter12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 8:40 下午
 */

public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        if (true) {
            (new BeforeAdvice()).exec();
        }
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }

}
