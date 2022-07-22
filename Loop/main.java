// using break statements in for loop
public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }
    }
}
