package chapter25.multi;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class Client {

    public static void main(String[] args) {
        AbstractActor actor = new OldActor();
        IRole role = new KungFuRole();
        role.accept(actor);
    }

}
