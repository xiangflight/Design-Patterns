package chapter23.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/5
 */

public class Facade2 {

    private Facade facade = new Facade();

    public void methodB() {
        this.facade.methodB();
    }

}
