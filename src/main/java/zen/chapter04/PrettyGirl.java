package zen.chapter04;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/9 9:56 下午
 */

public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {

    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "---脸蛋很漂亮!");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "---身材非常好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "---气质非常好");
    }
}
