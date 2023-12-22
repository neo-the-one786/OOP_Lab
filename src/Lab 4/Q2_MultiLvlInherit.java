// 4.2 Illustrate the execution of constructors in multi-level inheritance
// with three Java classes – plate(length, width), box(length, width, height), wood box (length,
// width, height, thick) where box inherits from plate and woodbox inherits from box class.
// Each class has constructor where dimensions are taken from user.

import java.util.Scanner;

class Plate {
    int length, breadth;

    Plate(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Boxx extends Plate {
    int height;

    Boxx(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
}

class WoodBox extends Boxx {
    int thickness;

    WoodBox(int length, int breadth, int height, int thickness) {
        super(length, breadth, height);
        this.thickness = thickness;
    }
}

class MultiLvlInherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions: ");
        int l = sc.nextInt(), b = sc.nextInt(), h = sc.nextInt(), t = sc.nextInt();
        Plate obj1 = new Plate(l, b);
        System.out.println("Dimensions of Plate: " + obj1.length + " x " + obj1.breadth);
        Boxx obj2 = new Boxx(l, b, h);
        System.out.println("Dimensions of Box: " + obj2.length + " x " + obj2.breadth + " x " + obj2.height);
        WoodBox obj3 = new WoodBox(l, b, h, t);
        System.out.println("Dimensions of Wood Box: " + obj3.length + " x " + obj3.breadth + " x " + obj3.height + " x " + obj3.thickness);
        sc.close();
    }
}
