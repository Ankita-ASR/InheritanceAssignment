public class EmployeeT {
    private String name;
    private double salary;

    public EmployeeT(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ", Salary: $" + salary;
    }
}

class Managers extends EmployeeT {
    private String department;

    public Managers(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

class Executive extends Manager {
    public Executive(String name, double salary, String department) {
        super(name, salary, Double.parseDouble(department));
    }

    @Override
    public String toString() {
        return "Executive: " + super.toString();
    }
}
