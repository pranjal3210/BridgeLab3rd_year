package this_static_final_key_words_and_instanceof_Operator.EmployeeManagementSystem;

import this_static_final_key_words_and_instanceof_Operator.EmployeeManagementSystem.ConsoleDisplayService;

public class Main {
    public static void main(String[] args) {
        ConsoleDisplayService displayService = new ConsoleDisplayService();

        CompanyService.setCompanyName("Tech Solutions Inc.");
        Employee emp1 = new Employee("Ayush", 101, "Software Engineer");
        CompanyService.incrementEmployeeCount();
        Employee emp2 = new Employee("Rohan", 102, "Project Manager");
        CompanyService.incrementEmployeeCount();
        displayService.displayTotalEmployees();
        System.out.println();
        displayService.displayEmployeeDetails(emp1);
        System.out.println();
        displayService.displayEmployeeDetails(emp2);
    }
}
