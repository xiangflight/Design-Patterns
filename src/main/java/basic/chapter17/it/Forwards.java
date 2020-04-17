package basic.chapter17.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    protected void attack() {
        System.out.println(String.format("前锋 %s 进攻", name));
    }

    @Override
    protected void defense() {
        System.out.println(String.format("前锋 %s 防守", name));
    }
}
