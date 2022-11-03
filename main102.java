class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("My ID is  " + id);
        System.out.println("My Name is  " + name);
    }
}

public class main102 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee();
        Employee john = new Employee();
        harry.id = 12;
        harry.name = " CodeWithHarry";
        john.id = 17;
        john.name = "John Kandewal";
        harry.printDetails();
        john.printDetails();
    }
}