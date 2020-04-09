package hw16.util;

import java.util.ArrayList;

public class Util {
    public static boolean findOperator(String element) {

        if ("+".equals(element)) {
            return true;

        } else if ("-".equals(element)) {
            return true;

        } else if ("*".equals(element)) {
            return true;

        } else if ("/".equals(element)) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> expressionToArray(String expr) {

        ArrayList<String> expression = new ArrayList();
        for (String element : expr.split(" "))
            expression.add(element);

        return expression;
    }
}
