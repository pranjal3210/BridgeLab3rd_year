package String_Practices.Level_1;

import java.util.Scanner;

public class LowerCaseDemo {
    public static String convertToLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
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

        String customLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Custom: " + customLower);
        System.out.println("Built-in: " + builtInLower);
        System.out.println("Are both same? " + compareUsingCharAt(customLower, builtInLower));
    }
}
