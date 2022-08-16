class main41 {

    int a;
    boolean b;

    main41() {
        a = 0;
        b = false;
    }

    public static void main(String[] args) {
        // call the constructor
        Main obj = new main41();

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}