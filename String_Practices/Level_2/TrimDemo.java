package String_Practices.Level_2;

import java.util.Scanner;

public class TrimDemo {
    public static int[] findTrimBounds(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) result += str.charAt(i);
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] bounds = findTrimBounds(text);
        String customTrim = substringUsingCharAt(text, bounds[0], bounds[1]);
        String builtinTrim = text.trim();

        System.out.println("Custom: '" + customTrim + "'");
        System.out.println("Built-in: '" + builtinTrim + "'");
        System.out.println("Same? " + compareUsingCharAt(customTrim, builtinTrim));
    }
}
