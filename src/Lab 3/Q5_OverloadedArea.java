import java.util.Scanner;

class OverloadedArea {
    float area(float r) {
        return (float) Math.PI * r * r;
    }

    float area(float a, float b, float c) {
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    float area(int a) {
        return (float) a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opt;
        do {
            System.out.println("Menu\nEnter 1 for area of cricle\nEnter 2 for area of triangle\nEnter 3 for area of square\nEnter 4 for exit");
            System.out.print("\nEnter your choice: ");
            opt = sc.nextByte();
            OverloadedArea obj = new OverloadedArea();
            switch (opt) {
                case 1:
                    System.out.print("\nEnter radius: ");
                    float r = sc.nextFloat();
                    System.out.println("Area of circle: " + obj.area(r));
                    break;
                case 2: {
                    System.out.print("\nEnter three sides: ");
                    float a = sc.nextFloat(), b = sc.nextFloat(), c = sc.nextFloat();
                    System.out.println("Area of triangle: " + obj.area(a, b, c));
                    break;
                }
                case 3:
                    System.out.print("\nEnter side: ");
                    int a = sc.nextInt();
                    System.out.println("Area of square: " + obj.area(a));
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid input");
            }
        } while (true);
    }
}
