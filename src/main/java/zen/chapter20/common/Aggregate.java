package zen.chapter20.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/28
 */

public interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator iterator();

}
