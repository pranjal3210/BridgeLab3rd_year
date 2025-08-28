import java.util.Scanner;

public class NumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int n : nums) {
            if (n > 0) {
                if (n % 2 == 0) System.out.println(n + " is Positive Even");
                else System.out.println(n + " is Positive Odd");
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println(n + " is Zero");
            }
        }

        if (nums[0] == nums[nums.length - 1]) {
            System.out.println("First and last are Equal");
        } else if (nums[0] > nums[nums.length - 1]) {
            System.out.println("First is Greater than last");
        } else {
            System.out.println("First is Less than last");
        }
        sc.close();
    }
}

