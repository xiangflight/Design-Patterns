package basic.chapter13.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class Director {

    public void construct(BaseBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }

}
