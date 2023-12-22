// 1.1 Write a program to print your name, roll no, section and branch in
// separate lines.

import java.util.Scanner;

class BasicIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter section");
        String section = sc.nextLine();
        System.out.println("Enter branch: ");
        String branch = sc.nextLine();
        System.out.println("Name: " + name + " \tSection: " + section + "\tRoll number: " + rollNo + "\tBranch: " + branch);
        sc.close();
    }
}
