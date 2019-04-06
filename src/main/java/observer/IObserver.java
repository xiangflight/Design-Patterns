package observer;

/**
 * 观察者：观察到变化后的更新，一般定义为接口
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version observer
 * @date 2019-04-06 19:32
 */

public interface IObserver {
    /**
     * 更新操作
     */
    void update();

}
