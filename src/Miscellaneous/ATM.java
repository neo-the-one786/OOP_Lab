import java.util.Scanner;

//Class is a user defined data type in C++, Java, Python, JavaScript etc.
//Class is quite similar to struct in C
//Class provides blueprint/template/catalogue/skeleton for creating objects (vastu)
class BankCustomer {

    //Every BankCustomer has the following attributes/data members/instance variables
    //Instance variable is a variable associated with an object (object ka variable)
    //Every object must have certain attributes (instance variables)
    private int accNo, branchCode;
    private String name;
    private float balance;

    //Constructor initializes every object of BankCustomer class
    //Every object's instance variables must be initialized, and that is done by the constructor
    BankCustomer(int accNo, int branchCode, String name, float balance) {
        //this keyword is a pointer/reference variable to the object of class
        //this keyword contains address of current this
        //this ka matlab ye hota hai, this keyword literally means "ye" or "iss" object
        this.accNo = accNo;
        this.branchCode = branchCode;
        this.name = name;
        this.balance = balance;
    }

    //Every BankCustomer can avail the following operations/instance functions/method
    //instance functions (object ke functions) or methods are functions of given object
    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdraw(float amount) {
        this.balance -= amount;
    }

    public float checkBalance() {
        return this.balance;
    }
}

public class ATM {

    public static void main(String[] args) throws NegativeAmountException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.println("Enter branch code: ");
        int branchCode = sc.nextInt();
        System.out.println("Enter name: ");
        //this extra nextLine() will eat up  the newline/enter character of previous line
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter balance: ");
        float balance = sc.nextFloat();
        //customer is merely a pointer/reference variable to the struct/class BankCustomer
        //new keyword is like malloc in that it allocates fresh memory space and creates the object
        //BankCustomer() is the constructor of this class which initializes our object
        BankCustomer customer = new BankCustomer(accNo, branchCode, name, balance);
        byte btn;
        //do while loop always executes at least once, even if condition is false, hence it best suited for creating menus
        do {
            System.out.println("Press 1 to deposit\nPress 2 to withdraw\nPress 3 to check balance\nEnter 4 to exit");
            System.out.println("Enter your choice: ");
            btn = sc.nextByte();
            float amount;
            switch (btn) {
                case 1: {
                    System.out.println("Enter amount: ");
                    amount = sc.nextFloat();
                    if (amount < 0) {
                        throw new NegativeAmountException();
                    }
                    //deposit() function is called through name of object, i.e., customer
                    customer.deposit(amount);
                    break;
                    //if break is not applied after each case, then fall through will occur and all cases will be executed
                }
                case 2: {
                    System.out.println("Enter amount: ");
                    amount = sc.nextFloat();
                    if (amount < 0) {
                        throw new NegativeAmountException();
                    }
                    customer.withdraw(amount);
                    break;
                }
                case 3: {
                    System.out.println("Balance: " + customer.checkBalance());
                    break;
                }
                case 4: {
                    System.exit(0);
                    return;
                }
                default: {
                    System.out.println("Invalid input!");
                }
            }
        } while (btn != 4);
    }
}

//Each exception (user-defined or inbuilt) must inherit the Exception superclass
class NegativeAmountException extends Exception {

    //constructor to throw message of exception
    NegativeAmountException() {
        //super keyword contains reference/address of super class
        //super() with brackets lets us call the constructor of super class
        //Constructor of Exception class takes a String message as input annd displays it on console when expetion is thrown
        super("Amount must NOT be -ve!!!");
    }
}
