// 3.3 Write a program in java to input and display the details of n number
// of students having roll, name and cgpa as data members. Also display the name of the
// student having lowest cgpa.

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    float cgpa;

    Student(int rollNo, String name, float cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students: ");
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        float min = Integer.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            System.out.print("\nEnter roll no:");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("\nEnter name: ");
            String name = sc.nextLine();
            System.out.print("\nEnter cgpa: ");
            float cgpa = sc.nextFloat();
            arr[i] = new Student(rollNo, name, cgpa);
            if (arr[i].cgpa < min) {
                min = arr[i].cgpa;
                minIdx = i;
            }
            min = (int) Math.min(min, arr[i].cgpa);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Roll no:" + arr[i].rollNo);
            System.out.println("Name: " + arr[i].name);
            System.out.println("Cgpa: " + arr[i].cgpa);
        }
        System.out.println("Student " + (minIdx + 1) + " had Min Cgpa: " + min);
        sc.close();
    }
}
