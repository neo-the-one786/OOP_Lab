import java.util.Scanner;

class Subtractor {
    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    float subtract(float num1, float num2) {
        return num1 - num2;
    }

    float subtract(int num1, float num2) {
        return num1 - num2;
    }

    float subtract(float num1, int num2) {
        return num1 - num2;
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minuend and subtrahend: ");
        Subtractor obj = new Subtractor();
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (sc.hasNextInt()) {
                System.out.println("Difference: " + obj.subtract(num, sc.nextInt()));
            } else if (sc.hasNextFloat()) {
                System.out.println("Difference: " + obj.subtract(num, sc.nextFloat()));
            }
        } else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            if (sc.hasNextFloat()) {
                System.out.println("Difference: " + obj.subtract(num, sc.nextFloat()));
            } else if (sc.hasNextInt()) {
                System.out.println("Difference: " + obj.subtract(num, sc.nextInt()));
            }
        }
        sc.close();
    }
}
