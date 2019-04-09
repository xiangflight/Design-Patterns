package facade;

/**
 * 调用者
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version facade
 * @date 2019-04-09 21:58
 */

public class Invoker {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }

}
