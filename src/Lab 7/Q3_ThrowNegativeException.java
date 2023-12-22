// 7.3 Write a Java class which has a method called ProcessInput(). This
// method checks the number entered by the user. If the entered number is negative then
// throw an user defined exception called NegativeNumberException, otherwise it
// displays the double value of the entered number.

import java.util.Scanner;

class ThrowNegativeException {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter +ve number: ");
        int num = sc.nextInt();
        processInput(num);
        System.out.println("Double value: " + (double) num);
        sc.close();
    }

    static void processInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException();
        }
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException() {
        super("Number should NOT be negative!");
    }
}