// 3.2 Write a program in Java to create a class Rectangle having data
// members length and breadth and three methods called read, calculate and display to
// read the values of length and breadth, calculate the area and perimeter of the rectangle
// and display the result respectively.

import java.util.Scanner;

class MethodCall {
    int length, breadth;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        this.length = sc.nextInt();
        this.breadth = sc.nextInt();
        sc.close();
    }

    int[] calculate() {
        int[] ans = new int[2];
        ans[0] = 2 * (this.length + this.breadth);
        ans[1] = this.length * this.breadth;
        return ans;
    }

    void display() {
        int[] ans = calculate();
        System.out.println("Perimeter: " + ans[0] + " Area: " + ans[1]);
    }

    public static void main(String[] args) {
        MethodCall obj = new MethodCall();
        obj.read();
        obj.display();
    }
}
