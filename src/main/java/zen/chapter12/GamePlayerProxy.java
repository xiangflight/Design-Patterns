package zen.chapter12;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 7:56 下午
 */

public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级费用是：150元");
    }
}
