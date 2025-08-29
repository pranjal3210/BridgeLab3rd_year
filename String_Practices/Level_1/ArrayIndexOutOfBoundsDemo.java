package String_Practices.Level_1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // Out of bounds
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.next();
        }
        //generateException(arr);
        handleException(arr);
    }
}
