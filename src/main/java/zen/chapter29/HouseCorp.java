package zen.chapter29;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/6 8:23 上午
 */

public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
