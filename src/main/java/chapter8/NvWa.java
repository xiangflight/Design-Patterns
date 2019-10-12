package chapter8;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 10:23 下午
 */

public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory yinYanglu = new HumanFactory();
        IHuman whiteHuman = yinYanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }

}
