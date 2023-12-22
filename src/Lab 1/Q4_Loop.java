// Write a program to check a user entered number is palindrome or
// not.

import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int rev = 0, temp = num;
        while (temp > 0) {
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp /= 10;
        }
        if (rev == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome!");
        }
        sc.close();
    }
}
