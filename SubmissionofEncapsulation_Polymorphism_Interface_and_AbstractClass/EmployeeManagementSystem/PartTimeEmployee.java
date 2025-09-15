package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.EmployeeManagementSystem;

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // Part-time salary is hours worked * hourly rate
        return hoursWorked * hourlyRate;
    }
}
