package zen.chapter05;

import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/10 6:46 下午
 */

public class Wizard {

    private Random random = new Random(System.currentTimeMillis());

    private int first() {
        System.out.println("执行第一个方法......");
        return random.nextInt(100);
    }

    private int second() {
        System.out.println("执行第二个方法......");
        return random.nextInt(100);
    }

    private int third() {
        System.out.println("执行第三个方法......");
        return random.nextInt(100);
    }

    public void installWizard() {
        int first = first();
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();
                if (third > 50) {
                    this.first();
                }
            }
        }
    }

}
