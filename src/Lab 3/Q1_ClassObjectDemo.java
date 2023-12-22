// 3.1 Write a class file – box with three data members (length, width,
// height) and a method volume (). Also implement the application class Demo where an
// object of the box class is created with user entered dimensions and volume is printed.

import java.util.Scanner;

class Box {
    int length, width, height;

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volume() {
        return this.length * this.width * this.height;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, widht and height: ");
        int l = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
        Box obj = new Box(l, w, h);
        System.out.println("Vol: " + obj.volume());
        sc.close();
    }
}
