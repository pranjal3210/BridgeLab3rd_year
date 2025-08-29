package String_Practices.Level_2;

import java.util.Scanner;

public class ShortestLongestDemo {
    public static int customLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } }
        catch (Exception e) { return count; }
    }

    public static String[] customSplit(String str) {
        int len = customLength(str);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) if (str.charAt(i) == ' ') spaceCount++;

        String[] words = new String[spaceCount + 1];
        int start = 0, index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = str.substring(start, len);
        return words;
    }

    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (customLength(w) < customLength(shortest)) shortest = w;
            if (customLength(w) > customLength(longest)) longest = w;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[] result = findShortestAndLongest(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
