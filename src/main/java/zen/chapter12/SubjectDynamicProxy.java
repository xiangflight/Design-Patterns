package zen.chapter12;

import java.lang.reflect.InvocationHandler;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 8:46 下午
 */

public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(ISubject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(classLoader, interfaces, handler);
    }

}
