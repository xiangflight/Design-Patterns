package zen.chapter12;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 8:02 下午
 */

public class RealSubject implements ISubject {

    @Override
    public void doSomething(String str) {
        System.out.println("do something! ---->" + str);
    }
}
