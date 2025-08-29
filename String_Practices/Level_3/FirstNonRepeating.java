package String_Practices.Level_3;

import java.util.Scanner;

public class FirstNonRepeating {
    public static char firstNonRepeating(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) return str.charAt(i);
        }
        return '\0'; // none
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char c = firstNonRepeating(text);
        if (c == '\0') System.out.println("No non-repeating character");
        else System.out.println("First non-repeating: " + c);
    }
}
