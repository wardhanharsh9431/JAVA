// to find the sum of 5 float values using arrays
public class main {
    public static void main(String[] args) {
        float[] marks = { 99.5f, 85.5f, 82.7f, 95.7f, 90.0f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is" + sum);
    }
}
