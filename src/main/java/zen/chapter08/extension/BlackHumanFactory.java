package zen.chapter08.extension;

import zen.chapter08.BlackHuman;
import zen.chapter08.IHuman;

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
