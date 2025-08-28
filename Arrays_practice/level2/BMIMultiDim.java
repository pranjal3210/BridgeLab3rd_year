package Arrays_practice.level2;

import java.util.Scanner;

public class BMIMultiDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double w, h;
            do {
                System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
                w = sc.nextDouble();
            } while (w < 0);
            do {
                System.out.print("Enter height(m) of person " + (i + 1) + ": ");
                h = sc.nextDouble();
            } while (h < 0);

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "Normal";
            else if (personData[i][2] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + personData[i][0] + " Height: " + personData[i][1] + " BMI: " + personData[i][2] + " Status: " + weightStatus[i]);
        }
    }
}
