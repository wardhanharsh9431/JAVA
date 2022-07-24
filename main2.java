//using Array find the average marks received
public class main2 {
    public static void main(String[] args) {
        float[] marks = { 85.5f, 99.9f, 65.6f, 66.3f, 78.3f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The Average marks received =" + sum / marks.length);

    }
}
