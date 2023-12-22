class SuperClass {
    String str;

    public SuperClass() {
    }

    public SuperClass(int var) {
        System.out.println("Superclass Parameterized Constructor");
    }
}

class SubClass extends SuperClass {

    public SubClass(int var) {
        System.out.println("Subclass Parameterized Constructor");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        SuperClass obj = new SubClass(10);
    }
}