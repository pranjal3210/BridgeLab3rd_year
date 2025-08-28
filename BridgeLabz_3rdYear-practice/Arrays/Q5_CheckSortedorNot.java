package arrays;
import java.util.*;
public class Q5_CheckSortedorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of an Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean res = true;
        System.out.print("Enter a Element in Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int st = 0;
        int end = arr.length-1;
        while(st<end){
           if(arr[st] < arr[end]){
            st++;
            end--;
           }
           else{
            res = false;
            break;
           }
        }
        System.out.println("Output :" + res);
        sc.close();
    }
}
