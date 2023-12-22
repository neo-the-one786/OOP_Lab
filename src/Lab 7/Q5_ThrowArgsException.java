// 7.5 Create an user defined exception named CheckArgument to check
// the number of arguments passed through command line. If the number of arguments is
// less than four then throw the Check Argument exception, else print the addition of
// squares of all the four elements.

class ThrowArgsException {
    public static void main(String[] args) throws TooFewArgumentsException {
        if (args.length < 4) {
            throw new TooFewArgumentsException();
        }
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(args[2]), d = Integer.parseInt(args[3]);
        System.out.println("Sum of squares: " + (a * a + b * b + c * c + d * d));
    }
}

class TooFewArgumentsException extends Exception {
    TooFewArgumentsException() {
        super("You must enter more arguments!");
    }
}