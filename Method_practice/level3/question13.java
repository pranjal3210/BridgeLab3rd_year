import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = generateScores(n);
        double[][] results = calculateResults(marks);
        displayScorecard(marks, results);
    }

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(100);
            scores[i][1] = rand.nextInt(100);
            scores[i][2] = rand.nextInt(100);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = total / 3.0;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-15s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-15.2f%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]
            );
        }
    }
}
