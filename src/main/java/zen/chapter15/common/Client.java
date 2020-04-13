package zen.chapter15.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class Client {

    public static void main(String[] args) {
        Invoker xiaoSan = new Invoker();
        System.out.println("-----客户要求增加一项需求-----");
        AbstractCommand command = new AddRequirementCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }

}
