package chapter12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 8:39 下午
 */

public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    public MyInvocationHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
