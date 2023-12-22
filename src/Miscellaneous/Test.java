package Miscellaneous;

// Base class: Apple
class Apple1 {
    public void show() {
        System.out.println("This is the show() method of Apple class");
    }
}

// Subclass: Banana (inherits from Apple)
class Banana1 extends Apple1 {
    @Override
    public void show() {
        System.out.println("This is the show() method of Banana class");
    }
}

// Subclass: Cherry (inherits from Apple)
class Cherry1 extends Apple1 {
    @Override
    public void show() {
        System.out.println("This is the show() method of Cherry class");
    }
}

public class Test {
    public static void main(String[] args) {
        Apple1 fruit0 = new Apple1(); // Upcasting
        Apple1 fruit1 = new Banana1(); // Upcasting
        Apple1 fruit2 = new Cherry1(); // Upcasting

        // Dynamic Method Dispatch
        fruit0.show();
        fruit1.show(); // Calls the show() method of Banana class
        fruit2.show(); // Calls the show() method of Cherry class
    }
}