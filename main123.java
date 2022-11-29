class Base1 {
    Base1() {

        System.out.println("I am a constructor");
    }

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class main123 {
    public static void main(String[] args) {
        Base1 b = new Base1();
    }
}
