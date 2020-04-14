package basic.chapter8.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public interface IFactory {
    /**
     * 创建具体的操作
     *
     * @return {@link BaseOperation}
     */
    BaseOperation createOperation();
}
