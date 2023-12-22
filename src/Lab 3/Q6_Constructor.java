// 3.6 Write a program in java using constructor overloading concept to
// calculate the area of a rectangle having data member as length and breadth. Use default
// constructor to initialize the value of the data member to zero and parameterized
// constructor to initialize the value of data member according to the user input.

import java.util.Scanner;

class Constructor {
    int length, breadth;

    Constructor() {
        this.length = 0;
        this.breadth = 0;
    }

    Constructor(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int perimeter() {
        return 2 * (this.length + this.breadth);
    }

    int area() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Constructor obj = new Constructor();
        obj = new Constructor(l, b);
        System.out.println("Perimeter: " + obj.perimeter() + "\tArea: " + obj.area());
        sc.close();
    }
}
