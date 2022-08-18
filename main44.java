class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting X now");
        this.x = x;
    }

    public void printme() {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void SetX(int y) {
        this.y = y;
    }
}

public class main44 {

    public static void main(String[] args) {
        Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());
    }
}
