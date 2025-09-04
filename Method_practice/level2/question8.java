import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        System.out.println("Enter ages of Amar, Akbar and Anthony:");
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
        }

        System.out.println("Enter heights of Amar, Akbar and Anthony:");
        for (int i = 0; i < 3; i++) {
            heights[i] = sc.nextInt();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("The youngest friend is: " + (youngest + 1));
        System.out.println("The tallest friend is: " + (tallest + 1));
    }

    static int findYoungest(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int findTallest(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
