import java.util.*;

public class main81 {
    public static int AverageMarks(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        int Avg = a + b + c + d + e + f + g + h + i + j / 10;
        return Avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 1st Subject ");
        int a = sc.nextInt();
        System.out.println("Enter marks of 2nd Subject ");
        int b = sc.nextInt();
        System.out.println("Enter marks of 3rd Subject ");
        int c = sc.nextInt();
        System.out.println("Enter marks of 4th Subject ");
        int d = sc.nextInt();
        System.out.println("Enter marks of 5th Subject ");
        int e = sc.nextInt();
        System.out.println("Enter marks of 6th Subject ");
        int f = sc.nextInt();
        System.out.println("Enter marks of 7th Subject ");
        int g = sc.nextInt();
        System.out.println("Enter marks of 8th Subject ");
        int h = sc.nextInt();
        System.out.println("Enter marks of 9th Subject ");
        int i = sc.nextInt();
        System.out.println("Enter marks of 10th Subject ");
        int j = sc.nextInt();
        int avg = AverageMarks(a, b, c, d, e, f, g, h, i, j);
        System.out.println("The Average Of the above Data is ");
        System.out.println(avg);
    }
}
