import java.util.*;

class NumberCheckerQ4 {
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        int[] arr = storeDigits(num);
        int[] rev = reverseArray(arr);
        return compareArrays(arr, rev);
    }

    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }

    public static void main(String[] args) {
        int num = 12030;
        System.out.println("Digits count: " + countDigits(num));
        System.out.println("Digits: " + Arrays.toString(storeDigits(num)));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(storeDigits(num))));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
    }
}
