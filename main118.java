class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My ID is  " + id);
        System.out.println("My Name is  " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class main118 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee();
        Employee john = new Employee();
        harry.id = 12;
        harry.salary = 34000;
        harry.name = " CodeWithHarry";
        john.id = 17;
        john.salary = 32000;
        john.name = "John Kandewal";
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}