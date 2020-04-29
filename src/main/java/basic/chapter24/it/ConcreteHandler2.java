package basic.chapter24.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/29
 */

public class ConcreteHandler2 extends AbstractHandler {

    @Override
    protected void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(String.format("%s处理请求%s", this.getClass().getSimpleName(), request));
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
