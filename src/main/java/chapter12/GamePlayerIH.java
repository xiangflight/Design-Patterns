package chapter12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 8:29 下午
 */

public class GamePlayerIH implements InvocationHandler {

    Class cls = null;

    Object obj = null;

    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人利用我的账号登录！");
        }
        return result;
    }
}
