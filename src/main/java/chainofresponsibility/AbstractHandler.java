package chainofresponsibility;

/**
 * 抽象处理者
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version chainofresponsibility
 * @date 2019-04-09 20:26
 */

public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    /**
     * 定义一个对请求的处理方法，这是一个模版方法，对外开放
     *
     * 该方法是final修饰的，不允许被override
     *
     * @param request 请求
     * @return 返回
     */
    final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 到链尾都没有处理者处理
            }
        }
        return response;
    }

    /**
     * 设置下一个处理者，编排链
     *
     * @param nextHandler 下一个处理者
     */
    void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 每一个处理者都有一个处理级别，自己处理还是给链中的下一个处理者处理
     *
     * @return 处理级别
     */
    protected abstract Level getHandlerLevel();

    /**
     * 每个处理者处理请求的逻辑
     *
     * @param request 请求
     * @return 返回
     */
    protected abstract Response echo(Request request);

}
