package zen.chapter16;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

public class Father extends AbstractHandler {

    public Father() {
        super(FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------女儿向父亲请示------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
}
