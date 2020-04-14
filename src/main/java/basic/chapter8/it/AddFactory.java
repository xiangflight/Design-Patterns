package basic.chapter8.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public class AddFactory implements IFactory {
    @Override
    public BaseOperation createOperation() {
        return new OperationAdd();
    }
}
