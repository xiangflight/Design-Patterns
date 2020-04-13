package zen.chapter17;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/23
 */

public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("我排名38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
