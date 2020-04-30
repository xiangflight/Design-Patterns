package basic.chapter27.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class Scale extends AbstractExpression {
    @Override
    protected void execute(String playKey, double playValue) {
        String scale = "";
        switch ((int) playValue) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
        }
    }
}
