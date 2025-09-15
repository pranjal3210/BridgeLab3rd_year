package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.EmployeeManagementSystem;

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // Full-time salary is base + bonus
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + (department != null ? department : "Not Assigned");
    }
}
