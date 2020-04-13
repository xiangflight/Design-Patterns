package zen.chapter17;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/23
 */

public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport {

    private void reportHighScore() {
        System.out.println("语文最高是75，数学78，自然是80");
    }

    private void reportSort() {
        System.out.println("我排名38名...");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
