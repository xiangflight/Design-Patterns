package chapter08;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:28 下午
 */

public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> c);

}
