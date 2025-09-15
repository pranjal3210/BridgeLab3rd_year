package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        FullTimeEmployee ftEmp = new FullTimeEmployee(101, "Ayush", 50000, 5000);
        ftEmp.assignDepartment("Technology");
        employees[0] = ftEmp;

        employees[1] = new PartTimeEmployee(102, "Anshitva", 0, 80, 25);

        System.out.println("Processing Employee Details:");
        for (Employee emp : employees) {
            System.out.println("-------------------------");
            emp.displayDetails();
            System.out.println("Calculated Salary: $" + emp.calculateSalary());
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
        }
    }
}
