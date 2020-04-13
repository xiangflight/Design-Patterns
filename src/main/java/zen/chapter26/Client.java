package zen.chapter26;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
    }

}
