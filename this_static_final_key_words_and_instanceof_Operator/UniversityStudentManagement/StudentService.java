package this_static_final_key_words_and_instanceof_Operator.UniversityStudentManagement;

class StudentService {
    public void updateGrade(Student student, char newGrade) {
        student.setGrade(newGrade);
        System.out.println("Grade updated to: " + newGrade);
    }
}
