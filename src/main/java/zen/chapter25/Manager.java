package zen.chapter25;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public class Manager extends AbstractEmployee {

    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
