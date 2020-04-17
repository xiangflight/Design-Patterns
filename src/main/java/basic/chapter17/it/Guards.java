package basic.chapter17.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    protected void attack() {
        System.out.println(String.format("后卫 %s 进攻", name));
    }

    @Override
    protected void defense() {
        System.out.println(String.format("后卫 %s 防守", name));
    }
}
