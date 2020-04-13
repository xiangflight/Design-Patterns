package zen.chapter25.multi;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class KungFuRole implements IRole {
    @Override
    public void accept(AbstractActor actor) {
        actor.act(this);
    }
}
