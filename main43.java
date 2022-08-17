
// Java Program to add elements in a String Array by creating a new Array  
import java.util.Arrays;

public class main43 {
    public static void main(String[] args) {
        // Declaring Initial Array
        String[] sa = { "A", "B", "C" };
        // Printing the Original Array
        System.out.println("Initial Array: " + Arrays.toString(sa));
        int length_Var = sa.length; // Defining the array length variable
        String newElement = "D"; // Defining new element to add
        // define new array with extended length
        String[] newArray = new String[length_Var + 1];
        // Adding all the elements to initial Array
        for (int i = 0; i < sa.length; i++) {
            newArray[i] = sa[i];
        }
        // Specifying the position of the added elements ( Last)
        newArray[newArray.length - 1] = newElement;
        // make it original and print
        sa = newArray;
        System.out.println("updated Array: " + Arrays.toString(sa));
    }
}