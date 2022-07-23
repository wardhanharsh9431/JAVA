//Using Array to print marks of 5 subjects and size of the array
public class main {
    public static void main(String[] args) {
        int[] marks = { 100, 98, 97, 47, 41 };
        for (int element : marks) {
            System.out.println(element);
        }
        System.out.println(marks.length);
        // to print Array in reverse order
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
    }
}