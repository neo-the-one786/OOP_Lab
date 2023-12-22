// 2.3 Write a program to sort the user entered list of numbers of any
// size.

import java.util.Arrays;
import java.util.Scanner;

class ArrSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < len; i++) {
            System.out.print(" " + arr[i]);
        }
        sc.close();
    }
}
