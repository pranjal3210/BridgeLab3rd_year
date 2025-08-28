package arrays;
import java.util.*;
public class Q1_CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a Size of an Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter a Element in Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a Element you want to Search :");
        int k = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.println("Output : " + count);
        sc.close();
    }
}
