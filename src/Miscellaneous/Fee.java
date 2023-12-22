import java.util.Scanner;

abstract class Register {
    String name, discipline;
    int rollNo;

    abstract void fees();

    abstract void details(String name, int rollNo, String discipline);
}

class BTech extends Register {
    @Override
    public void details(String name, int rollNo, String discipline) {
        this.name = name;
        this.rollNo = rollNo;
        this.discipline = discipline;
    }

    @Override
    public void fees() {
        System.out.println("BTech Total Fee: Rs " + 50000 * 4);
    }
}

class MTech extends Register {
    @Override
    public void details(String name, int rollNo, String discipline) {
        this.name = name;
        this.rollNo = rollNo;
        this.discipline = discipline;
    }

    @Override
    public void fees() {
        System.out.println("MTech Total Fee: Rs " + 50000 * 2);
    }
}

public class Fee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll number: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter discipline: ");
        sc.nextLine();
        String discipline = sc.nextLine();
        Register student = new BTech();
        student.details(name, rollNo, discipline);
        student.fees();
        student = new MTech();
        student.details(name, rollNo, discipline);
        student.fees();
    }
}
