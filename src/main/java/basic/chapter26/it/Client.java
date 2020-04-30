package basic.chapter26.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class Client {

    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyweightFactory f = new FlyweightFactory();
        AbstractFlyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicState);

        AbstractFlyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicState);

        AbstractFlyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicState);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);

    }

}
