// 2.2 Write a program to accept 10 numbers from command line and
// check how many of them are even and how many are odd.

class CmdLnArgsEvenOdd {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        for (String arg : args) {
            if (Integer.parseInt(arg) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even + "\tTotal odd numbers: " + odd);
    }
}