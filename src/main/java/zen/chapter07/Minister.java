package zen.chapter07;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 9:52 下午
 */

public class Minister {

    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是: ");
            emperor.say();
        }
    }

}
