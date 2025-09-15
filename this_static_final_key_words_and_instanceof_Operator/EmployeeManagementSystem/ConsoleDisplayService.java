package this_static_final_key_words_and_instanceof_Operator.EmployeeManagementSystem;

class ConsoleDisplayService {
    public void displayTotalEmployees() {
        System.out.println("Total Employees: " + CompanyService.getTotalEmployees());
    }

    public void displayEmployeeDetails(Object empObject) {
        if (empObject instanceof Employee) {
            Employee employee = (Employee) empObject;
            System.out.println("Company Name: " + CompanyService.getCompanyName());
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Designation: " + employee.getDesignation());
        } else {
            System.out.println("The object is not an instance of the Employee class.");
        }
    }
}
