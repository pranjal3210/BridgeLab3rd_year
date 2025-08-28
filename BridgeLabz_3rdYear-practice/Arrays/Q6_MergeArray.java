package arrays;
import java.util.*;
public class Q6_MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter a Size of an 1st Array :");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter a Element in Array :");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter a Size of an 2nd Array :");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        int[] nums = new int[size1+size2];
        for(int i = 0; i < arr1.length; i++){
            nums[i] = arr1[i];
            count++;
        }
        for(int i = 0; i < arr2.length; i++){
            nums[count] = arr2[i];
            count++;
        }
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
