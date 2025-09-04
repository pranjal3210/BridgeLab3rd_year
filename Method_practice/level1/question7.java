import java.util.Scanner;

public class SmallestLargest {
    static void findSmallestLargest(int a, int b, int c) {
        int smallest = a, largest = a;

        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        findSmallestLargest(a, b, c);
        sc.close();
    }
}
