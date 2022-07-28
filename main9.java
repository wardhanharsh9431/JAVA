// to print a multiplication table using methods in javq
public class main9 {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * 1);
        }
    }

    public static void main(String[] args) {
        multiplication(7);
    }
}
