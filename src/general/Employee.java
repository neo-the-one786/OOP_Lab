package general;

public class Employee {
    protected int empID;
    private String eName;

    public Employee(int empID, String eName) {
        this.empID = empID;
        this.eName = eName;
    }

    public float earnings(float ba) {
        return ba + 0.8f * ba + 0.15f * ba;
    }
}
