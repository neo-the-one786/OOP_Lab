// 2.6 Write a program to find sum of each Diag (left &amp; right)
// elements separately of a user entered 3 X 3 mtx in Java.

import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mtx = new int[3][3];
        System.out.println("Enter 3x3 mtx:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mtx[i][j] = sc.nextInt();
            }
        }
        int lDiagSum = 0, rDiagSum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    lDiagSum += mtx[i][j];
                }
                if (i == 3 - j - 1) {
                    rDiagSum += mtx[i][j];
                }
            }
        }
        System.out.println("Left diagonal sum: " + lDiagSum + "\tRight diagonal sum: " + rDiagSum);
        sc.close();
    }
}
