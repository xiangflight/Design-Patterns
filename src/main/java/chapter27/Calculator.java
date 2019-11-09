package chapter27;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        char[] charArr = expStr.toCharArray();
        Expression left;
        Expression right;
        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArr[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArr[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArr[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }

}
