package chapter03;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/5 10:50 下午
 */

public class Driver implements IDriver {

    private ICar car;

    @Override
    public void setCar(ICar car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.run();
    }
}
