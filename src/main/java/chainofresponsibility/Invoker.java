package chainofresponsibility;

/**
 * 调用者
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version chainofresponsibility
 * @date 2019-04-09 20:39
 */

public class Invoker {

    public static void main(String[] args) {
        AbstractHandler handler1 = new Concretehandler1();
        AbstractHandler handler2 = new Concretehandler2();
        AbstractHandler handler3 = new Concretehandler3();
        // 编排链，构成链的顺序为 handler1 -> handler2 -> handler3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        // 提交请求到责任链头结点就可以
        Response response = handler1.handleMessage(new Request());
    }

}
