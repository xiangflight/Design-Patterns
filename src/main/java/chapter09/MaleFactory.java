package chapter09;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:26 下午
 */

public class MaleFactory implements IHumanFactory {
    @Override
    public IHuman createYellowHuman() {
        return new MaleYellowHuman();
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
