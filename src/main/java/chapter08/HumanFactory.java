package chapter08;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:20 下午
 */

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends IHuman> T createHuman(Class<T> c) {
        IHuman human = null;
        try {
            human = (IHuman) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
