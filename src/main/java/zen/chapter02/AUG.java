package zen.chapter02;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/5 10:31 下午
 */

public class AUG extends Rifle {

    public void zoomOut() {
        System.out.println("通过望远镜察看敌人...");
    }

    @Override
    public void shoot() {
        System.out.println("AUG射击...");
    }
}
