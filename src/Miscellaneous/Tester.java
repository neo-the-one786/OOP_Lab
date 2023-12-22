package Miscellaneous;

import java.util.Scanner;
class SavingsAccount {
    static float interestRate;
    int accountNo;
    String name;
    float balance;
    SavingsAccount(int accountNo, String name, float balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
    static float modifyInterest(float interestRate) {
        SavingsAccount.interestRate = interestRate;
        return SavingsAccount.interestRate;
    }
    float calcInterest(float p, float r, float t) {
        return p * r * t / 100f;
    }
}
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNo = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter balance: ");
        float balance = sc.nextFloat();
        SavingsAccount obj1 = new SavingsAccount(accountNo, name, balance);
        System.out.println("Enter principal: ");
        float p = sc.nextFloat();
        System.out.println("Enter rate: ");
        float r = SavingsAccount.modifyInterest(sc.nextFloat());
        System.out.println("Enter time: ");
        float t = sc.nextFloat();
        System.out.println("Interest: " + obj1.calcInterest(p, r, t));
        SavingsAccount obj2 = new SavingsAccount(accountNo, name, balance);
        System.out.println("Enter new rate: ");
        r = SavingsAccount.modifyInterest(sc.nextFloat());
        System.out.println("Interest: " + obj2.calcInterest(p, r, t));
        sc.close();
    }
}