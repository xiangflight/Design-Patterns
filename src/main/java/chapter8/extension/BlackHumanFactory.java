package chapter8.extension;

import chapter8.BlackHuman;
import chapter8.IHuman;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:05 下午
 */

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public IHuman createHuman() {
        return new BlackHuman();
    }
}
