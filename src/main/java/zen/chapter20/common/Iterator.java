package zen.chapter20.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/28
 */

public interface Iterator {

    /**
     * 遍历到下一个元素
     *
     * @return 下一个元素
     */
    Object next();

    /**
     * 是否已遍历到尾部
     *
     * @return true if 没到尾部
     */
    boolean hasNext();

    /**
     * 删除当前元素
     *
     * @return 删除元素
     */
    boolean remove();

}
