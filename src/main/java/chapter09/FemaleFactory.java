package chapter09;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:25 下午
 */

public class FemaleFactory implements IHumanFactory {
    @Override
    public IHuman createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public IHuman createWhiteHuman() {
        return null;
    }

    @Override
    public IHuman createBlackHuman() {
        return null;
    }
}
