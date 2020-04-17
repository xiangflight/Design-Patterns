package basic.chapter17.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    protected void attack() {
        foreignCenter.jingong();
    }

    @Override
    protected void defense() {
        foreignCenter.fangshou();
    }
}
