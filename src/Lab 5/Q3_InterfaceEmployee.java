// 5.3 Define an interface Emploee with a method getDetails() to get
// emplyee details as Empid and Ename. Also define a derived interface Manager with a
// method getDeptDetails() to get department details such as Deptid and Deptname.Then
// define a class Head which implements Manager interface and also prints all details of
// the employee. Write the complete program to display all details of one head of the
//department.

import java.util.Scanner;

interface Employee {
    void getDetails(int empID, String eName);
}

interface Manager extends Employee {
    void getDeptDetails(int deptID, String deptName);
}

class Head implements Manager {
    int empID, deptID;
    String eName, deptName;

    @Override
    public void getDetails(int empID, String eName) {
        this.empID = empID;
        this.eName = eName;
    }

    @Override
    public void getDeptDetails(int deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
    }

    void printDetails() {
        System.out.println("Employee ID: " + this.empID + "\tEmployee Name: " + this.eName);
        System.out.println("Department ID: " + this.deptID + "\tDepartment Name: " + this.deptName);
    }
}

class InterfaceEmployee {
    public static void main(String[] args) {
        Employee obj = new Head();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int empID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name: ");
        String eName = sc.nextLine();
        System.out.println("Enter Dept ID: ");
        int deptID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Dept name: ");
        String deptName = sc.nextLine();
        obj.getDetails(empID, eName);
        ((Head) obj).getDeptDetails(deptID, deptName);
        ((Head) obj).printDetails();
        sc.close();
    }
}
