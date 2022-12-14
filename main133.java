// Java program to Illustrate Robustness In a Program
// Using Loops

// Importing input output classes
import java.io.*;

// Main class
class main133 {

    // Main driver method
    public static void main(String[] args)
            throws IOException {
        // Custom input - Radius of a circle
        double radius = 50;

        // Reading input
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        // Asking from user to enter radius
        System.out.println("Enter Radius::");

        // 1st.This while loop will run since
        // 50>Integer.MIN_VALUE
        while (radius > Integer.MIN_VALUE) {

            // 2nd.It's time to read the buffer
            radius = Double.parseDouble(br.readLine()); // **

            // 3rd.If radius>0 give result and break the
            // loop.
            if (radius > 0) {
                double Perimeter = 2 * Math.PI * radius;
                double Area = Math.PI * Math.pow(radius, 2);
                System.out.println("Perimeter:: "
                        + Perimeter);
                System.out.println("Area:: " + Area);
                break;
            }

            // 4th.If radius=-100(say) then print the
            // following
            System.out.println(
                    "please enter non zero positive number");
            System.out.println("Enter Radius::");

            // 5th.As -100>Integer.MIN_VALUE the loop will
            // run again.
        }
    }
}