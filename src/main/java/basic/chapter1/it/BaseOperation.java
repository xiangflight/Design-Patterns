package basic.chapter1.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/13
 */

public abstract class BaseOperation {

    protected double a;

    protected double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    /**
     * 得到最终结果
     *
     * @return 结果
     */
    abstract double getResult();
}
