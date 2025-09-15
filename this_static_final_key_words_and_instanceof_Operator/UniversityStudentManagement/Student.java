package this_static_final_key_words_and_instanceof_Operator.UniversityStudentManagement;

class Student {
    private final int rollNumber;
    private String name;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public int getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public char getGrade() { return grade; }
    public void setGrade(char grade) { this.grade = grade; }
}
