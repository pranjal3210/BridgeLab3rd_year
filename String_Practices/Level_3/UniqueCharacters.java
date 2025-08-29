package String_Practices.Level_3;

import java.util.Scanner;

public class UniqueCharacters {
    public static int customLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } }
        catch (Exception e) { return count; }
    }

    public static char[] uniqueChars(String str) {
        int len = customLength(str);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) { found = true; break; }
            }
            if (!found) temp[index++] = c;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = uniqueChars(text);

        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
