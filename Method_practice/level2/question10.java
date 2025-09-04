import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] members = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();

            System.out.println("Enter height (cm) of person " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            members[i][2] = calculateBMI(members[i][0], members[i][1]);
        }

        System.out.println("\nWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            String status = getBMIStatus(members[i][2]);
            System.out.println(members[i][0] + "\t\t" + members[i][1] + "\t\t" + String.format("%.2f", members[i][2]) + "\t" + status);
        }
    }

    static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 40) return "Overweight";
        else return "Obese";
    }
}
