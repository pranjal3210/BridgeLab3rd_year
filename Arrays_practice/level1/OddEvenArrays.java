import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int[] odd = new int[n / 2 + 1];
        int[] even = new int[n / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) even[evenIndex++] = i;
            else odd[oddIndex++] = i;
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
        sc.close();
    }
}
