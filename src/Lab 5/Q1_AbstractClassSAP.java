import java.util.Scanner;

abstract class Studentt {
    int rollNo, regNo;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no: ");
        this.rollNo = sc.nextInt();
        System.out.println("Enter registration no: ");
        this.regNo = sc.nextInt();
    }

    abstract void course();
}

class Kiitian extends Studentt {
    String courseName;

    @Override
    void course() {
        super.getInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course name: ");
        this.courseName = sc.nextLine();
        System.out.println("The course is: " + this.courseName);
        sc.close();
    }
}

class SAPPortal {
    public static void main(String[] args) {
        Studentt obj = new Kiitian();
        obj.course();
    }
}
