import java.util.*;

public class main79 {
    public static int division(int a, int b) {
        int div = a / b;
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number to be Divided");
        int a = sc.nextInt();
        System.out.println("Enter Second NUmber to be Divided");
        int b = sc.nextInt();
        int div = division(a, b);
        System.out.println("The Result is ");
        System.out.println(div);
    }

}
