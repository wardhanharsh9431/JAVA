// Java Program to Simply Get the Area of Shapes
// Without considering robustness into play

// Importing Scanner class to
// read input
import java.util.Scanner;

// Main class
public class main56 {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of Scanner class to
        // take input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius::");
        double radius = s.nextDouble();
        double perimeter;
        double area;

        // If radius is negative
        if (radius <= 0) {

            System.out.println(
                    "please enter non zero positive number ");
        }

        // Radius is positive
        else {

            // Compute area and perimeter
            perimeter = 2 * Math.PI * radius;
            area = Math.PI * radius * radius;

            // Print and display area and parameter
            System.out.println("Perimeter:: " + perimeter);
            System.out.println("Area:: " + area);
        }
    }
}
