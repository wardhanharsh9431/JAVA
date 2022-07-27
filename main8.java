// Using Recursion in JAVA
public class main8 {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println("The Factorial value of x is: " + factorial(x));
    }
}
