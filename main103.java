class main103 {

    String language;

    // constructor with no parameter
    main103() {
        this.language = "Java";
    }

    // constructor with a single parameter
    main103(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        main27 obj1 = new main27();

        // call constructor with a single parameter
        main27 obj2 = new main27("Python");

        obj1.getName();
        obj2.getName();
    }
}