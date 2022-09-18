import java.util.*;

public class main75 {
    public static int sumOfTwo(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int sum = sumOfTwo(a, b);
        System.out.println("The Sum of A and B is");
        System.out.println(sum);
    }
}