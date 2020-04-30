package basic.chapter27.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public abstract class AbstractExpression {

    public void interpret(PlayContext context) {
        if (context.getPlayText().length() == 0) {
            return;
        }
        String playKey = context.getPlayText().substring(0, 1);
        context.setPlayText(context.getPlayText().substring(2));
        double playValue = Double.parseDouble(context.getPlayText().substring(0, context.getPlayText().indexOf(" ")));
        execute(playKey, playValue);
    }

    protected abstract void execute(String playKey, double playValue);

}
