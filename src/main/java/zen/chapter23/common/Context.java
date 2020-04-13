package zen.chapter23.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/5
 */

public class Context {

    private ClassA a = new ClassA();
    private ClassC c = new ClassC();

    public void complexMethod() {
        this.a.doSomethingA();
        this.c.doSomethingC();
    }

}
