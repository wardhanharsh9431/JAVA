class main124 {

    String language;

    // constructor with no parameter
    main124() {
        this.language = "Java";
    }

    // constructor with a single parameter
    main124(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        Main obj1 = new main124();

        // call constructor with a single parameter
        Main obj2 = new Main("Python");

        obj1.getName();
        obj2.getName();
    }
}