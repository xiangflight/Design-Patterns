package zen.chapter27;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
