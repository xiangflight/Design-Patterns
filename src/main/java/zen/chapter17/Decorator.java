package zen.chapter17;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/23
 */

public class Decorator extends SchoolReport {

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
