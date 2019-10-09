package chapter4;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/9 10:08 下午
 */

public class Searcher extends AbstractSearcher {

    public Searcher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void show() {
        System.out.println("-----美女信息如下-----");
        prettyGirl.goodLooking();
        prettyGirl.niceFigure();
        prettyGirl.greatTemperament();
    }
}
