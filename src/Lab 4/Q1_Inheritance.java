// 4.1 A Plastic manufacturer sells plastic in different shapes like 2D sheet
// and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic
// ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the
// user where 3D inherits from 2D.

import java.util.Scanner;

class TwoD {
    int length, breadth, cost;

    TwoD(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.cost = 40 * this.length * this.breadth;
    }
}

class ThreeD extends TwoD {
    int height;

    ThreeD(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
        this.cost = 60 * this.length * this.breadth * this.height;
    }
}

class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions: ");
        int l = sc.nextInt(), b = sc.nextInt(), h = sc.nextInt();
        TwoD obj1 = new TwoD(l, b);
        System.out.println("Cost of plastic sheet: " + obj1.cost);
        ThreeD obj2 = new ThreeD(l, b, h);
        System.out.println("Cost of plastic box: " + obj2.cost);
        sc.close();
    }
}
