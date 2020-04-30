package basic.chapter26.it;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class FlyweightFactory {

    private Map<String, AbstractFlyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public AbstractFlyweight getFlyweight(String key) {
        return flyweights.get(key);
    }

}
