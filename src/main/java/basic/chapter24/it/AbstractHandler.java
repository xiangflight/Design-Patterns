package basic.chapter24.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public abstract class AbstractHandler {

    protected AbstractHandler successor;

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求
     *
     * @param request 请求
     */
    protected abstract void handleRequest(int request);

}
