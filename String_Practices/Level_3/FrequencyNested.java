package String_Practices.Level_3;

import java.util.Scanner;

public class FrequencyNested {
    public static String[] frequency(String str) {
        char[] chars = str.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        String[] result = new String[chars.length];
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[idx++] = chars[i] + " : " + freq[i];
            }
        }
        String[] finalRes = new String[idx];
        for (int i = 0; i < idx; i++) finalRes[i] = result[i];
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] table = frequency(text);

        System.out.println("Character frequencies:");
        for (String row : table) System.out.println(row);
    }
}
