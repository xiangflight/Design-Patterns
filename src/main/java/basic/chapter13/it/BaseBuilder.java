package basic.chapter13.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public abstract class BaseBuilder {

    /**
     * 创建A部分
     */
    abstract void buildPartA();

    /**
     * 创建B部分
     */
    abstract void buildPartB();

    /**
     * 创建产品
     *
     * @return Product
     */
    abstract Product createProduct();

}
