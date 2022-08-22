// To print minimun value of an array
public class main6 {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 65, 98, 48, 977, 5 };
        int min = 1000000;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("The minimum value of the array is   " + min);
    }
}
