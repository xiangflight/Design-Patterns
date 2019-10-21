package chapter16;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

public class Son extends AbstractHandler {

    public Son() {
        super(SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------母亲向儿子请示------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
