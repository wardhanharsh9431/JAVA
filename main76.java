import java.util.*;

public class main76 {
    public static int multiplyTwoNumbers(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUmber");
        int a = sc.nextInt();
        System.out.println("Enter Second NUmber");
        int b = sc.nextInt();
        int mult = multiplyTwoNumbers(a, b);
        System.out.println("The Multiplication of two numbers is ");
        System.out.println(mult);
    }
}
