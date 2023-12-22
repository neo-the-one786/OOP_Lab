// 6.1 Define two packages as – General and Marketing. In General
// package define a class ‘employee’ with data members as empid(protected),
// ename(private) and a public method as earnings() which calculate total earnings as
// earnings basic + DA (80% of basic) + HRA (15% of basic)
// In Marketing package define a class ‘sales’ which is extending from ‘employee’ class and
// has a method tallowance() which calculates Travelling Allowance as 5% of total earning.
// Write the programs to find out total earning of a sales person for the given basic salary
// amount and print along with the emp id.

import general.Employee;
import marketing.Sales;

import java.util.Scanner;

class UsePack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int empID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String eName = sc.nextLine();
        System.out.println("Enter basic salary: ");
        float ba = sc.nextFloat();
        Employee obj = new Employee(empID, eName);
        System.out.println("Employee id: " + empID);
        System.out.println("Total earnings: " + obj.earnings(ba));
        Sales obj1 = new Sales(empID, eName);
        System.out.println("Travel allowance: " + obj1.tAllowance(ba));
        sc.close();
    }
}
