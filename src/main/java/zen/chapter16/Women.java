package zen.chapter16;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

public class Women implements IWomen {

    private int type = 0;

    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
            default:
        }
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
