package String_Practices.Level_3;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean logic1(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public static boolean logic2(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return logic2(str, start + 1, end - 1);
    }

    public static boolean logic3(String str) {
        char[] original = str.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < str.length(); i++) {
            reverse[i] = str.charAt(str.length() - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic1: " + logic1(text));
        System.out.println("Logic2: " + logic2(text, 0, text.length() - 1));
        System.out.println("Logic3: " + logic3(text));
    }
}
