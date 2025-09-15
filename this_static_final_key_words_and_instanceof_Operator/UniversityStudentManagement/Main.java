package this_static_final_key_words_and_instanceof_Operator.UniversityStudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        ConsoleDisplayService displayService = new ConsoleDisplayService();

        UniversityService.setUniversityName("Global University");

        Student student1 = new Student("Ayush", 101, 'A');
        UniversityService.incrementTotalStudents();
        Student student2 = new Student("Anshitva", 102, 'B');
        UniversityService.incrementTotalStudents();

        displayService.displayTotalStudents();
        System.out.println();

        displayService.displayStudentDetails(student1);
        System.out.println();
        displayService.displayStudentDetails(student2);
        System.out.println();

        studentService.updateGrade(student2, 'A');
        System.out.println();

        displayService.displayStudentDetails(student2);
    }
}
