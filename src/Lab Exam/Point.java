import java.util.Scanner;

public class Point {
    float x, y;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static float calcDistance(Point p1, Point p2) {
        float xDist = (float) Math.pow(p2.x - p1.x, 2);
        float yDist = (float) Math.pow(p2.y - p1.y, 2);
        return (float) Math.sqrt(xDist + yDist);
    }

    public static void dispDist(Point p1, Point p2) {
        System.out.println("Distance b/w both points: " + calcDistance(p1, p2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st point coordinates:");
        Point p1 = new Point(sc.nextFloat(), sc.nextFloat());
        System.out.println("Enter 2nd point coordinates:");
        Point p2 = new Point(sc.nextFloat(), sc.nextFloat());
        System.out.println("Distance b/w both points: " + calcDistance(p1, p2));
        dispDist(p1, p2);
        sc.close();
    }
}