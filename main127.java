import java.util.*;

// create class ElectricityBillExample1 to calculate electricity bill  
class main127.java
{
    // main() method start
    public static void main(String args[]) {
        // declare variable units
        int units;

        // variable to calculate electricity bill to pay
        double billToPay = 0;

        // create Scanner class object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of units for calculating electricity bill.");
        units = sc.nextInt();

        // check whether units are less than 100
        if (units < 100) {
            billToPay = units * 1.20;
        }
        // check whether the units are less than 300
        else if (units < 300) {
            billToPay = 100 * 1.20 + (units - 100) * 2;
        }
        // check whether the units are greater than 300
        else if (units > 300) {
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }
        System.out.println("The electricity bill for " + units + " is : " + billToPay);
    }
}