import java.util.Scanner;

class Data {
    float breadth, height;

    void getData(float breadth, float height) {
        this.breadth = breadth;
        this.height = height;
    }

    void putData() {
        System.out.println("Breadth: " + this.breadth + "\tHeight: " + this.height);
    }
}

class Rectangle extends Data {
    Rectangle(float breadth, float height) {
        super.getData(breadth, height);
        super.putData();
    }

    float perimeterRectangle() {
        return 2 * (this.breadth + this.height);
    }

    float areaRectangle() {
        return this.breadth * this.height;
    }
}

class Triangle extends Data {
    Triangle(float breadth, float height) {
        super.getData(breadth, height);
        super.putData();
    }

    float perimeterTriangle() {
        float hypotenuse = (float) Math.sqrt(Math.pow(this.breadth, 2) + Math.pow(this.height, 2));
        return this.breadth + this.height + hypotenuse;
    }

    float areaTriangle() {
        return 0.5f * (this.breadth * this.height);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rectangle:\nEnter breadth and height: ");
        float b = sc.nextFloat(), h = sc.nextFloat();
        Data obj = new Rectangle(b, h);
        System.out.println("Perimeter: " + ((Rectangle) obj).perimeterRectangle() + "\tArea: " + ((Rectangle) obj).areaRectangle());
        System.out.println("Triangle: ");
        System.out.println("Enter breadth and height: ");
        b = sc.nextFloat();
        h = sc.nextFloat();
        obj = new Triangle(b, h);
        System.out.println("Perimeter: " + ((Triangle) obj).perimeterTriangle() + "\tArea: " + ((Triangle) obj).areaTriangle());
        sc.close();
    }
}