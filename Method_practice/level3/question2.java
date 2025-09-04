import java.util.*;

class NumberChecker {
    static int countDigits(int n) {
        return String.valueOf(n).length();
    }
    static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }
    static boolean isDuck(int[] arr) {
        for (int i = 1; i < arr.length; i++) if (arr[i] == 0) return true;
        return false;
    }
    static boolean isArmstrong(int n) {
        int[] arr = digitsArray(n);
        int len = arr.length, sum = 0;
        for (int d : arr) sum += Math.pow(d, len);
        return sum == n;
    }
    static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int d : arr) if (d > max) max = d;
        return max;
    }
    static int secondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : arr) {
            if (d > max1) { max2 = max1; max1 = d; }
            else if (d > max2 && d != max1) max2 = d;
        }
        return max2;
    }
    static int smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int d : arr) if (d < min) min = d;
        return min;
    }
    static int secondSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d < min1) { min2 = min1; min1 = d; }
            else if (d < min2 && d != min1) min2 = d;
        }
        return min2;
    }
    public static void main(String[] args) {
        int n = 153;
        int[] arr = digitsArray(n);
        System.out.println("Count: " + countDigits(n));
        System.out.println("Duck: " + isDuck(arr));
        System.out.println("Armstrong: " + isArmstrong(n));
        System.out.println("Largest: " + largest(arr));
        System.out.println("Second Largest: " + secondLargest(arr));
        System.out.println("Smallest: " + smallest(arr));
        System.out.println("Second Smallest: " + secondSmallest(arr));
    }
}
