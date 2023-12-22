// 2.5 Write a program to find the no. of occurrence of each element in
// a user entered list of nos.

import java.util.Scanner;

class ElemCount {

    static void elemFreqCounter(int[] arr) {
        boolean[] isVisited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (isVisited[i]) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isVisited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + ": " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        elemFreqCounter(arr);
        sc.close();
    }
}
