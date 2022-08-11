// Java program to demonstrate the various
// methods to iterate over a string array 

public class main32 {
    public static void main(String[] args) {
        String[] arr = { "Apple", "Banana", "Orange" };

        // First method
        for (String i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Second method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Third method
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}