package zen.chapter25.multi;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class OldActor extends AbstractActor {

    @Override
    public void act(KungFuRole role) {
        System.out.println("年龄大了，不能扮演功夫角色");
    }
}
