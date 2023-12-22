// 5.2 Illustrate the usage of abstract class with following Java classes –
// i. An abstract class ‘student’ with two data members roll no, reg no, a method
// getinput() and an abstract method course()
//ii. A subclass ‘kiitian’ with course() method implementation
// Write the driver class to print the all details of a kiitian object.

interface Motor {
    int capacity = 50;

    void run();

    void consume();
}

class WashingMachine implements Motor {

    @Override
    public void run() {
        System.out.println("Washing machine is running");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is cosuming power");
    }
}

class InterfaceMotor {
    public static void main(String[] args) {
        Motor obj = new WashingMachine();
        System.out.println("Capacity: " + obj.capacity);
        obj.run();
        obj.consume();
    }
}
