// 7.2 Write a Java program to handle an ArithmeticException
// using try, catch, and finally block.

import java.util.Scanner;

class TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divisor and dividend: ");
        int divisor = sc.nextInt(), dividend = sc.nextInt();
        try {
            System.out.println(divisor / dividend);
        } catch (ArithmeticException e) {
            System.out.println("Make sure this expression can't be zero before doing this division.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Enter divisor and dividend: ");
            divisor = sc.nextInt();
            dividend = sc.nextInt();
            System.out.println(divisor / dividend);
            System.out.println("End of program");
            sc.close();
        }
    }
}