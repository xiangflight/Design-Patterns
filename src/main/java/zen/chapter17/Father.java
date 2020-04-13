package zen.chapter17;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/23
 */

public class Father {

    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FourthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");
    }

}
