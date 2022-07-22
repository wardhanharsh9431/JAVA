// using continue statement in for loop
public class main2 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;

            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}
