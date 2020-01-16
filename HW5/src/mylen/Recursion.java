package mylen;

public class Recursion {

    public void printFromN(int n) {
        if (n > 0) {
            printFromN(n-1);
            System.out.print ( n);
        }
    }

    public int printSun(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + printSun(n / 10);
        }
    }
}
