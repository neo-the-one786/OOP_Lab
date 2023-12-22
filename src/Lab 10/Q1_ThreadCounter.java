// 10.1 Write a program in Java using multi-threading which will display a
// counter value within a specified range with a gap of 5 milliseconds after setting its
// name as given by the user.

import java.util.Scanner;

class ThreadCounter extends Thread {
    String name;
    int lower, upper;

    ThreadCounter(String name, int lower, int upper) {
        this.name = name;
        this.lower = lower;
        this.upper = upper;
    }

    public void run() {
        for (int i = this.lower; i <= this.upper; i++) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thread name: ");
        String name = sc.next();
        System.out.println("Enter lower and uper bounds: ");
        int lower = sc.nextInt(), upper = sc.nextInt();
        ThreadCounter obj = new ThreadCounter(name, lower, upper);
        obj.start();
        sc.close();
    }
}