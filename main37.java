class main37 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends main37 {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends main37 {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark();//C.T.Error
    }
}