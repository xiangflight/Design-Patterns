package chapter8;

import chapter8.extension.BlackHumanFactory;
import chapter8.extension.WhiteHumanFactory;
import chapter8.extension.YellowHumanFactory;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:23 下午
 */

public class NvWa {

    public static void main(String[] args) {
        IHuman whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        IHuman blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        IHuman yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
