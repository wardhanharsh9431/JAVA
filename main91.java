import java.util.*;

public class main91 {
    public static int sumOfTwo(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number");
        int c = sc.nextInt();
        System.out.println("Enter 4th Number");
        int d = sc.nextInt();
        int sum = sumOfTwo(a, b, c, d);
        System.out.println("The Sum of A and B is");
        System.out.println(sum);
    }
}