package main;

public class Recursion {
    public static void main(String[] args) {
    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num) {
        // breaking condition or base case
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}
