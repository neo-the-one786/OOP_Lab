// 4.4 Write a class Account containing acc_no, balance as data members
// and two methods as input() for taking input from user and disp() method to display the
// details. Create a subclass Person which has name and aadhar_no as extra data members and
// override disp() function. Write the complete progrm to take and print details of three
// persons.

import java.util.Scanner;

class Account {
    int accNo, balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account no:");
        this.accNo = sc.nextInt();
        System.out.println("Enter balance: ");
        this.balance = sc.nextInt();
    }

    void display() {
        System.out.println("Account no:" + this.accNo + "\tBalance: " + this.balance);
    }
}

class Person extends Account {
    String name;
    int aadhaarNo;

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter name:");
        this.name = sc.next();
        System.out.println("Enter aadhaar no: ");
        this.aadhaarNo = sc.nextInt();
    }

    @Override
    void display() {
        System.out.println("Account no:" + this.accNo);
        System.out.println("Balance: " + this.balance);
        System.out.println("Name:" + this.name);
        System.out.println("Aadhaar no: " + this.aadhaarNo);
    }
}

class SBI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] obj = new Person[3];
        for (int i = 0; i < 3; i++) {
            obj[i] = new Person();
            System.out.println("Person " + (i + 1) + ": ");
            obj[i].input();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ": ");
            obj[i].display();
        }
        sc.close();
    }
}
