package basic.chapter26.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class ConcreteFlyweight extends AbstractFlyweight {

    @Override
    protected void operation(int extrinsicState) {
        System.out.println("具体Flyweight:" + extrinsicState);
    }
}
