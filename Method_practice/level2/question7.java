import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }
        StudentVoteChecker checker = new StudentVoteChecker();
        for (int i = 0; i < 10; i++) {
            if (checker.canStudentVote(ages[i]))
                System.out.println("Student " + (i + 1) + " can vote.");
            else
                System.out.println("Student " + (i + 1) + " cannot vote.");
        }
        sc.close();
    }
}
