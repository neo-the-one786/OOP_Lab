// 7.1 Write a Java program to generate an
// ArrayIndexOutofBoundsException and handle it using catch statement.

import java.util.Scanner;

class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= len; i++) {
            try {
                arr[i] = sc.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array has been accessed with an illegal index");
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}