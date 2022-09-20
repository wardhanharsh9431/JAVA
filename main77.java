import java.util.*;

public class main77 {
    public static int Multiplication(int a, int b, int c) {
        int mult = a * b * c;
        return mult;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUmber");
        int a = sc.nextInt();
        System.out.println("Enter Second NUmber");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        int mult = Multiplication(a, b, c);
        System.out.println("The Multiplication of two numbers is ");
        System.out.println(mult);
    }
}
