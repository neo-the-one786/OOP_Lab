import java.util.Scanner;

public class Distance {
    double ft, in;

    Distance(float ft, float in) {
        this.ft = ft;
        this.in = in;
    }

    Distance(int ft, int in) {
        this.ft = ft;
        this.in = in;
    }

    Distance(double ft, double in) {
        this.ft = ft;
        this.in = in;
    }

    Distance(double in) {
        this.in = in;
    }

    Distance() {

    }

    public static Distance addDist(Distance d1, Distance d2) {
        Distance d3 = new Distance();
        d3.ft = d1.ft + d2.ft;
        d3.in = d1.in + d2.in;
        while (d3.in >= 12) {
            d3.ft++;
            d3.in -= 12;
        }
        return d3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st distance in ft and in: ");
        Distance d1 = new Distance(sc.nextInt(), sc.nextInt());
        System.out.println("Enter 2nd distance in ft and in: ");
        Distance d2 = new Distance(sc.nextFloat(), sc.nextFloat());
        Distance d3 = addDist(d1, d2);
        System.out.println("Sum of distances: " + d3.ft + " ft " + d3.in + " in");
        sc.close();
    }
}