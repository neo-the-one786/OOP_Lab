package Miscellaneous;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mtx = new int[3][3];
        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mtx[i][j] = sc.nextInt();
            }
        }
        System.out.println("Upper traingular matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j > i) {
                    System.out.print(" " + mtx[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
