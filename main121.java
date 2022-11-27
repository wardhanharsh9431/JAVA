class main121 {

    int a;
    boolean b;

    main121() {
        a = 0;
        b = false;
    }

    public static void main(String[] args) {
        // call the constructor
        Main obj = new main121();

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}