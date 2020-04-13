package zen.chapter23.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/5
 */

public class Facade {

    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private Context context = new Context();

    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.context.complexMethod();
    }

}
