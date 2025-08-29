package String_Practices.Level_1;

import java.util.Scanner;

public class UpperCaseDemo {
    public static String convertToUpper(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String customUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Custom: " + customUpper);
        System.out.println("Built-in: " + builtInUpper);
        System.out.println("Are both same? " + compareUsingCharAt(customUpper, builtInUpper));
    }
}
