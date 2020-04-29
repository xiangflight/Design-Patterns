package basic.chapter24.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class ConcreteHandler1 extends AbstractHandler {

    @Override
    protected void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(String.format("%s处理请求%s", this.getClass().getSimpleName(), request));
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
