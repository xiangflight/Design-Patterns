package zen.chapter12;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 8:42 下午
 */

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
