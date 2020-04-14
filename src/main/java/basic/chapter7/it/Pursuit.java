package basic.chapter7.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public class Pursuit implements IGiveGift {

    private SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + " 送洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + " 送鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + " 送巧克力");
    }

}
