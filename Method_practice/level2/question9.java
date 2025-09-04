import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 0) {
            System.out.println("First and Last numbers are Equal");
        } else if (result > 0) {
            System.out.println("First number is Greater than Last");
        } else {
            System.out.println("First number is Smaller than Last");
        }
    }

    static boolean isPositive(int n) {
        return n >= 0;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }
}
