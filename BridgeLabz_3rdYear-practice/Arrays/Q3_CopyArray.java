package arrays;
import java.util.*;
public class Q3_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of an Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] nums = new int[size];
        System.out.print("Enter a Element in Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
