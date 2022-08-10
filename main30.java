// Java Program to add elements in a pre-allocated Array  
import java.util.Arrays;  
public class main30 {  
        public static void main(String[] args) {  
            String[] sa = new String[7]; // Creating a new Array of Size 7  
            sa[0] = "A"; // Adding Array elements  
            sa[1] = "B";  
            sa[2] = "C";  
            sa[3] = "D";  
            sa[4] = "E";  
            System.out.println("Original Array Elements:" + Arrays.toString(sa));  
            int numberOfItems = 5;  
            String newItem = "F"; // Expanding Array Elements Later  
            String newItem2 ="G";  
            sa[numberOfItems++] = newItem;  
            sa[numberOfItems++] = newItem2;  
            System.out.println("Array after adding two elements:" +    
                      Arrays.toString(sa));  
        }  
    }