package zen.chapter25.multi;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public abstract class AbstractActor {

    public void act(IRole role) {
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KungFuRole role) {
        System.out.println("演员可以扮演功夫角色");
    }

}
