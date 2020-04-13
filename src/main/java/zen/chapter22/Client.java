package zen.chapter22;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/2
 */

public class Client {

    public static void main(String[] args) {
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        hanFeiZi.haveBreakfast();
    }

}
