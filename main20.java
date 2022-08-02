
// PLAYING ROCK SCISSORS PAPER
import java.util.Random;
import java.util.Scanner;

public class main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper,2 for scissors");
        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 1 || userInput == 0 && computerInput == 2
                || userInput == 2 && computerInput == 1 || userInput == 1 && computerInput == 0) {
            System.out.println("You Win");
        } else {
            System.out.println("You Loose");
        }
    }
}