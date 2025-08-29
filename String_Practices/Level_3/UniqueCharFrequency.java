package String_Practices.Level_3;

import java.util.Scanner;

public class UniqueCharFrequency {
    public static char[] uniqueChars(String str) {
        char[] temp = new char[str.length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
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

    public static String[][] frequency(String str) {
        char[] unique = uniqueChars(str);
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) freq[str.charAt(i)]++;

        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] table = frequency(text);

        System.out.println("Char\tFreq");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
