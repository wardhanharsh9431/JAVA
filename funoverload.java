
/* WAP in java to find  the sum of digit, count the digits and reverse of digits using function overload */
import java.util.Scanner;

class Digit_Num {
    int m, n, sum = 0, count = 0;
    Scanner S = new Scanner(System.in);

    void DigitofNum() {
        System.out.print("Enter the number: ");
        m = S.nextInt();
        while (m > 0) {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    void DigitofNum(int digit) {
        while (digit > 0) {
            n = digit % 10;
            count++;
            digit = digit / 10;
        }
        System.out.println("Count of digits: " + count);
    }

    void DigitofNum(int digit, int rev) {
        while (digit > 0) {
            n = digit % 10;
            rev = rev * 10 + n;
            digit = digit / 10;
        }
        System.out.println("Reverse of digits: " + rev);
    }
}

class funoverload {
    public static void main(String args[]) {
        int rev = 0, ml;
        Scanner SI = new Scanner(System.in);
        System.out.print("Enter the number(inside main): ");
        ml = SI.nextInt();
        Digit_Num dn = new Digit_Num();
        dn.DigitofNum();
        dn.DigitofNum(ml);
        dn.DigitofNum(ml, rev);
    }
}