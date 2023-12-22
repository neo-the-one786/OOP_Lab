package Miscellaneous;

import java.util.Scanner;
public class CommonDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter both numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Common digits: ");
        int[] digFreq1 = new int[10];
        int[] digFreq2 = new int[10];
        while (num1 > 0) {
            int dig = num1 % 10;
            digFreq1[dig]++;
            num1 /= 10;
        }
        while (num2 > 0) {
            int dig = num2 % 10;
            digFreq2[dig]++;
            num2 /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (digFreq1[i] > 0 && digFreq2[i] > 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
