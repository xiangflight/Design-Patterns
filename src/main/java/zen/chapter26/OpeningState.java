package zen.chapter26;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        // do nothing
    }

    @Override
    public void stop() {
        // do nothing
    }
}
