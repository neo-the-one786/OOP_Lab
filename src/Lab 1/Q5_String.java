import java.util.Scanner;

class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st and last name: ");
        String name1 = sc.next();
        String name2 = sc.next();
        System.out.println(name2 + " " + name1);
        sc.close();
    }
}
