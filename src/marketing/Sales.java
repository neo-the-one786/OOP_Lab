package marketing;

import general.Employee;

public class Sales extends Employee {
    public Sales(int empID, String eName) {
        super(empID, eName);
    }

    public float tAllowance(float ba) {
        return 0.05f * ba;
    }
}
