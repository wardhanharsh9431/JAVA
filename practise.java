import java.util.*;

public class practise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");12
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("A is Equal to B");
        } else if (a > b) {
            System.out.println("A is Greater than B");
        } else if (a < b) {
            System.out.println("A is Lesser than B");
        }
    }
}
