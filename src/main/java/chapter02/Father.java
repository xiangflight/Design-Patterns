package chapter02;

import java.util.Collection;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/5 10:35 下午
 */

public class Father {

    public Collection doSomething(Map map) {
        System.out.println("父类被执行...");
        return map.values();
    }

}
