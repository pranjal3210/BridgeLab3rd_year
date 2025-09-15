package this_static_final_key_words_and_instanceof_Operator.UniversityStudentManagement;

class ConsoleDisplayService {
    public void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + UniversityService.getTotalStudents());
    }

    public void displayStudentDetails(Object studentObject) {
        if (studentObject instanceof Student) {
            Student student = (Student) studentObject;
            System.out.println("University Name: " + UniversityService.getUniversityName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
        } else {
            System.out.println("The object is not an instance of the Student class.");
        }
    }
}
