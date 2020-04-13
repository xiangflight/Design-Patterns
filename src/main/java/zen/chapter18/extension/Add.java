package zen.chapter18.extension;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/26
 */

public class Add implements ICalculator {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
