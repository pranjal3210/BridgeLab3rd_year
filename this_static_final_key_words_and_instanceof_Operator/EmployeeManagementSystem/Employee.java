package this_static_final_key_words_and_instanceof_Operator.EmployeeManagementSystem;

class Employee {
    private String name;
    // Final variable to ensure the employee ID cannot be modified
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getDesignation() { return designation; }
}
