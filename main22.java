class Employee {
    // class member variable
    private int eId;
    private String eName;
    private String eDesignation;
    private String eCompany;

    public int getEmpId() {
        return eId;
    }

    public void setEmpId(final int eId) {
        this.eId = eId;
    }

    public String getEmpName() {
        return eName;
    }

    public void setEmpName(final String eName) {
        // Validating the employee's name and
        // throwing an exception if the name is null or its length is less than or equal
        // to 0.
        if (eName == null || eName.length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.eName = eName;
    }

    public String getEmpDesignation() {
        return eDesignation;
    }

    public void setEmpDesignation(final String eDesignation) {
        this.eDesignation = eDesignation;
    }

    public String getEmpCompany() {
        return eCompany;
    }

    public void setEmpCompany(final String eCompany) {
        this.eCompany = eCompany;
    }

    // for printing the values
    @Override
    public String toString() {
        String str = "Employee: [id = " + getEmpId() + ", name = " + getEmpName() + ", designation = "
                + getEmpDesignation() + ", company = " + getEmpCompany() + "]";
        return str;
    }
}

// Main class.
public class main22 {
    // main method
    public static void main(String argvs[]) {
        // Creating an object of the Employee class
        final Employee emp = new Employee();

        // the employee details are getting set using the setter methods.
        emp.setEmpId(107);
        emp.setEmpName("Kathy");
        emp.setEmpDesignation("Software Tester");
        emp.setEmpCompany("XYZ Corporation");

        // Displaying the details of the employee details using the
        // 'toString()' method, which uses the getter methods
        System.out.println(emp.toString());
    }
}