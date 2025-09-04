import java.util.Scanner;

public class ChocolatesDivision {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];
        result[0] = numberOfChocolates % numberOfChildren;
        result[1] = numberOfChocolates / numberOfChildren;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[1] + ", Remaining chocolates: " + result[0]);
        sc.close();
    }
}
