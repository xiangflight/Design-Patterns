package chapter4;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/9 10:12 下午
 */

public class Client {

    public static void main(String[] args) {
        IPrettyGirl yanYan = new PrettyGirl("嫣嫣");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
    }

}
