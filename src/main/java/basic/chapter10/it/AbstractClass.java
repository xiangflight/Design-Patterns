package basic.chapter10.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public abstract class AbstractClass {

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("ok");
    }

    /**
     * 步骤2
     */
    protected abstract void primitiveOperation2();

    /**
     * 步骤1
     */
    protected abstract void primitiveOperation1();

}
