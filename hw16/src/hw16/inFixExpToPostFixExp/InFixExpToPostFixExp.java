package hw16.inFixExpToPostFixExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import static hw16.util.Util.expressionToArray;
import static hw16.util.Util.findOperator;
import static java.lang.String.*;

public class InFixExpToPostFixExp {

    public static String inFixExpToPostFixExp(String inFixExpr) {
        Stack stack = new Stack();
        ArrayList<String> postfixList = new ArrayList<String>();
        ArrayList<String> inFixExpression = expressionToArray(inFixExpr);
        for (String elementExpression : inFixExpression) {
            if (findOperator(elementExpression) == false) {
                postfixList.add(elementExpression);
            } else if (elementExpression.equals("(")) {
                stack.push(elementExpression);
            } else if (elementExpression.equals(")")) {
                String topToken = (String) stack.pop();
                while (!topToken.equals("(")) {
                    postfixList.add(topToken);
                    topToken = (String) stack.pop();
                }
            } else {
                while (!stack.empty() && (priorOperator((String) (stack.peek())) >= priorOperator(elementExpression))) {
                    postfixList.add((String) (stack.pop()));
                }
                stack.push(elementExpression);
            }
        }
        while (!stack.empty()) {
            postfixList.add((String) stack.pop());
        }
        return arrayToString(postfixList);
    }

    private static int priorOperator(String operator) {
        if ("+".equals(operator)) {
            return 2;

        } else if ("-".equals(operator)) {
            return 2;

        } else if ("*".equals(operator)) {
            return 3;

        } else if ("/".equals(operator)) {
            return 3;
        } else if ("(".equals(operator)) {
            return 1;
        }
        return 0;
    }

    private static String arrayToString(ArrayList<String> arrayList) {
        String listString = "";
        for (String list : arrayList) {
            listString += list + " ";
        }
        return listString;
    }
}
