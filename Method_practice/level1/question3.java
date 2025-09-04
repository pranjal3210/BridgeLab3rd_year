import java.util.Scanner;

public class TriangularPark {
    static int rounds(int a, int b, int c) {
        int perimeter = a + b + c;
        return (5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Number of rounds to complete 5km run: " + rounds(a, b, c));
        sc.close();
    }
}
