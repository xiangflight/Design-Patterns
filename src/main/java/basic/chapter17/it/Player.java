package basic.chapter17.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    protected abstract void attack();

    protected abstract void defense();
}
