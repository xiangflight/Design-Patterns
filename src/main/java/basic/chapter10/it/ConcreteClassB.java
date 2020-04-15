package basic.chapter10.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class ConcreteClassB extends AbstractClass {
    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类B 方法2的实现");
    }

    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类B 方法1的实现");
    }
}
