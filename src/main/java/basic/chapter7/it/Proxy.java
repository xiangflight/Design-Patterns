package basic.chapter7.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public class Proxy implements IGiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl girl) {
        pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }

}
