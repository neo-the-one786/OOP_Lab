class ClassName {
    int var = 10;

    void display(int var) {
        System.out.println("Instance/Object variable: " + this.var);
        System.out.println("Local variable/Function parameter: " + var);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        ClassName obj = new ClassName();
        int var = 20;
        obj.display(var);
    }
}
