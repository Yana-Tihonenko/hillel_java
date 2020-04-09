package hw16.postFixExpressionCalculate;

import java.util.ArrayList;
import java.util.Stack;

import static hw16.util.Util.expressionToArray;
import static hw16.util.Util.findOperator;

public class PostFixExpressionCalculate {

    public static int postFixExpressionCalculate(String postFixExpr) {
        Stack stack = new Stack();
        ArrayList<String> postFixExpression = expressionToArray(postFixExpr);
        for (String elementExpression : postFixExpression) {
            if (findOperator(elementExpression) == false) {
                stack.push(Integer.parseInt(elementExpression));
            } else {
                Integer operand2 = (Integer) stack.pop();
                Integer operand1 = (Integer) stack.pop();
                stack.push(caclulateExpr(operand1, operand2, elementExpression));
            }
        }
        return (Integer) stack.pop();
    }

    private static int caclulateExpr(int operand1, int operand2, String operator) {

        if ("+".equals(operator)) {
            return operand1 + operand2;

        } else if ("-".equals(operator)) {
            return operand1 - operand2;

        } else if ("*".equals(operator)) {
            return operand1 * operand2;

        } else if ("/".equals(operator)) {
            return operand1 / operand2;
        }
        return 0;
    }
}
