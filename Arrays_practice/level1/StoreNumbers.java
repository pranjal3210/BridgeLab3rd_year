import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double val = sc.nextDouble();
            if (val <= 0 || index == 10) break;
            arr[index++] = val;
        }

        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum = " + total);
        sc.close();
    }
}
