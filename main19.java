class MyEmploye {
    private int id;
    private String name;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public void setid(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class main19 {
    public static void main(String[] args) {
        MyEmploye harry = new MyEmploye();
        harry.setname("CodeWithHarry");
        System.out.println(harry.getname());
        harry.setid(234);
        System.out.println(harry.getId());
    }
}
