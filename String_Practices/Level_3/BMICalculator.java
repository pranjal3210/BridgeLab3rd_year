package String_Practices.Level_3;

import java.util.Scanner;

public class BMICalculator {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";
        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] prepareTable(double[][] hw) {
        String[][] table = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            String[] bmiStatus = calculateBMI(hw[i][0], hw[i][1]);
            table[i][0] = String.valueOf(hw[i][0]); // weight
            table[i][1] = String.valueOf(hw[i][1]); // height
            table[i][2] = bmiStatus[0];             // BMI
            table[i][3] = bmiStatus[1];             // Status
        }
        return table;
    }

    public static void display(String[][] table) {
        System.out.println("Weight\tHeight(cm)\tBMI\tStatus");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }
        String[][] table = prepareTable(hw);
        display(table);
    }
}
