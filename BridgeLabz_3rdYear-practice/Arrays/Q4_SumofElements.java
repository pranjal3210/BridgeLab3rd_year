package arrays;
import java.util.*;
public class Q4_SumofElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of an Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        System.out.print("Enter a Element in Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Output : " + sum);
        sc.close();
    }
}
