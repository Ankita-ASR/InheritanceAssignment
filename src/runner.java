public class runner {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Alice");
        employee.setBaseSalary(40000);

        // Create a Manager object
        Manager manager = new Manager("Bob", 50000, 10000);

        // Print Employee details
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: $" + employee.getSalary());


        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Salary: $" + manager.getSalary());
        System.out.println("Manager Bonus: $" + manager.getBonus());
    }
}
