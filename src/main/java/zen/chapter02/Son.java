package zen.chapter02;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/5 10:36 下午
 */

public class Son extends Father {

    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行...");
        return map.values();
    }
}
