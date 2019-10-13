package chapter9;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 4:35 下午
 */

public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}
