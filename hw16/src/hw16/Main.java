package hw16;

import static hw16.inFixExpToPostFixExp.InFixExpToPostFixExp.inFixExpToPostFixExp;
import static hw16.postFixExpressionCalculate.PostFixExpressionCalculate.postFixExpressionCalculate;

public class Main {

    public static void main(String[] args) {
        System.out.println((inFixExpToPostFixExp("1 * 2 + 3 * 4")));

        System.out.println(postFixExpressionCalculate("1 2 * 3 4 * + "));

        System.out.println(postFixExpressionCalculate((inFixExpToPostFixExp("1 * 2 + 3 * 4"))));
    }
}
