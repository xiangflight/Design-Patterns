package chapter08.extension;

import chapter08.IHuman;
import chapter08.YellowHuman;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:05 下午
 */

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public IHuman createHuman() {
        return new YellowHuman();
    }
}
