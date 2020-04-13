package zen.chapter27;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
