// Write a program to print the week day for the given day no. of the
// current month using switch case statement.

import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number: ");
        int day = sc.nextInt();
        System.out.print("Day Name: ");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        sc.close();
    }
}
