import java.util.*;

class NumberChecker2 {
    static int countDigits(int n) {
        return String.valueOf(n).length();
    }
    static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }
    static int sumOfDigits(int[] arr) {
        int sum = 0;
        for (int d : arr) sum += d;
        return sum;
    }
    static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int d : arr) sum += Math.pow(d, 2);
        return sum;
    }
    static boolean isHarshad(int n, int[] arr) {
        return n % sumOfDigits(arr) == 0;
    }
    static int[][] frequency(int[] arr) {
        int[] freq = new int[10];
        for (int d : arr) freq[d]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 21;
        int[] arr = digitsArray(n);
        System.out.println("Digits count: " + countDigits(n));
        System.out.println("Sum of digits: " + sumOfDigits(arr));
        System.out.println("Sum of squares: " + sumOfSquares(arr));
        System.out.println("Harshad: " + isHarshad(n, arr));
        int[][] freq = frequency(arr);
        for (int[] f : freq) if (f[1] > 0) System.out.println(f[0] + " -> " + f[1]);
    }
}
