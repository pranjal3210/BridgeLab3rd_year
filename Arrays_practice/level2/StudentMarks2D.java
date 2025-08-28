package Arrays_practice.level2;

import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + " of student " + (i + 1) + ": ");
                int m = sc.nextInt();
                if (m < 0) {
                    j--;
                    continue;
                }
                marks[i][j] = m;
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " - %: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}
