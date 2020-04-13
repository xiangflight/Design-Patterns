package zen.chapter12;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 7:50 下午
 */

public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在杀怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
