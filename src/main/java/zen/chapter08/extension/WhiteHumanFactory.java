package zen.chapter08.extension;

import zen.chapter08.IHuman;
import zen.chapter08.WhiteHuman;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:06 下午
 */

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public IHuman createHuman() {
        return new WhiteHuman();
    }
}
