// 7.4 Write a program to create user defined exceptions called
// HrsException, MinException and SecException. Create a class Time which contains data
// members hours, minutes, seconds and a method to take a time from user which throws
// the user defined exceptions if hours (&gt;24 &amp;&lt;0),minutes(&gt;60 &amp;&lt;0),seconds(&gt;60 &amp;&lt;0).

import java.util.Scanner;

class Time {
    int hrs, min, sec;

    Time(int hrs, int min, int sec) {
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    public static void main(String[] args) throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
        inputTime();
    }

    static void inputTime() throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time: ");
        int hrs = sc.nextInt();
        if (hrs < 0) {
            throw new InvalidHourException();
        }
        int min = sc.nextInt();
        if (min < 0) {
            throw new InvalidMinuteException();
        }
        int sec = sc.nextInt();
        if (sec < 0) {
            throw new InvalidSecondException();
        }
        System.out.println("Correct Time: " + hrs + ":" + min + ":" + sec);
        sc.close();
    }
}

class InvalidHourException extends Exception {
    InvalidHourException() {
        super("Hour must NOT be -ve or greater than 24!");
    }
}

class InvalidMinuteException extends Exception {
    InvalidMinuteException() {
        super("Minute must NOT be -ve or greater than 60!");
    }
}

class InvalidSecondException extends Exception {
    InvalidSecondException() {
        super("Second must NOT be -ve or greater than 60!");
    }
}