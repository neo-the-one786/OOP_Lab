// 2.1 Write a program to find the largest among 3 user entered nos. at
// the command prompt using Java.

class CmdLnArgs {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]), num3 = Integer.parseInt(args[2]);
        System.out.println("Max: " + Math.max(num1, Math.max(num2, num3)));
    }
}
