package Arrays_practice.level2;

import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, maxDigit = 10, index = 0;
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        int[] digits = new int[maxDigit];

        while (number != 0) {
            if (index == maxDigit) break;
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
