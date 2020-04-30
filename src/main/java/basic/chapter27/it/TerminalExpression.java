package basic.chapter27.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class TerminalExpression extends AbstractExpression {

    @Override
    protected void interpret(Context context) {
        System.out.println("终端解释器");
    }

}
