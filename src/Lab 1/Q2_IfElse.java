// 1.2 Write a program to print the corresponding grade for the given
// mark using if..Else statement in Java.

import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int mark = sc.nextInt();
        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade: O");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Grade: E");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Grade: A");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Grade: B");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Invalid marks");
        }
        sc.close();
    }
}
