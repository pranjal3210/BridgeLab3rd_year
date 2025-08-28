package arrays;
import java.util.*;
public class Q2_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of an Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter a Element in Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
