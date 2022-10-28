class main100 {
    public static void main(String[] args) {
        String str = "Java is easy to learn";
        char c = 'a';
        int count = 0;
        // First Approach
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (ch == c)
                count++;
        }
        System.out.println("Total occurrence of character 'a' using 1st approach = " + count);

        // Second Approach
        int count2 = str.length() - str.replace("a", "").length();
        System.out.println("Total occurrence of character 'a' using 2nd approach = " + count2);
    }
}