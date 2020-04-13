package zen.chapter05;

import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/10 7:31 上午
 */

public class GroupLeader {

    private List<Girl> listGirls;

    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }

    public void countGirls() {
        System.out.println("女生数量是：" + listGirls.size());
    }

}
