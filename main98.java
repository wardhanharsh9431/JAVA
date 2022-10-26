// Java program to demonstrate the
// conversion of String array to String

public class main98 {
    public static void main(String[] args) {
        String[] myarr = { "The", "quick", "brown", "fox", "jumps",
                "over", "the", "lazy", "dog" };

        StringBuilder sb = new StringBuilder();
        sb.append(myarr[0]);

        for (int i = 1; i < myarr.length; i++) {
            sb.append(" " + myarr[i]);
        }

        String s = sb.toString();
        System.out.println(s);
    }
}