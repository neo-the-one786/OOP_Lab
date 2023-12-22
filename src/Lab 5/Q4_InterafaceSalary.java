// 5.3 Define an interface with three methods – earnings(), deductions()
// and bonus() and define a Java class ‘Manager’ which uses this interface without
// implementing bonus() method. Also define another Java class ‘Substaff’ which extends
// from ‘Manager’ class and implements bonus() method. Write the complete program to
// find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by
// the user as per the following guidelines –
// earnings basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF 12% of basic
// bonus 50% of basic

import java.util.Scanner;

interface Salary {
    float earnings(float bs);

    float deductions(float bs);

    float bonus(float bs);
}

class Managerr implements Salary {

    public float earnings(float bs) {
        return bs + 0.8f * bs + 0.15f * bs;
    }

    public float deductions(float bs) {
        return 0.12f * bs;
    }

    public float bonus(float bs) {
        throw new UnsupportedOperationException("Manager gets no bonuses!");
    }
}

class Substaff extends Managerr {

    @Override
    public float bonus(float bs) {
        return 0.5f * bs;
    }
}

class SalaryDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        float bs = sc.nextFloat();
        Salary obj = new Substaff();
        System.out.println("Earnings: " + obj.earnings(bs) + "\tEarnings: " + obj.deductions(bs) + "\tEarnings: " + obj.bonus(bs));
        sc.close();
    }
}
