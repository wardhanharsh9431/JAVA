//TO print maximum value of an array
public class main5 {
    public static void main(String[] args) {
        int[] arr = { 12, 25, 999, 1080, 9865, 52, 96, 1025 };
        int max = 0;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("The maximum marks stored in the array is  " + max);
    }
}
