package looping;

import java.util.Scanner;

public class Ques_3_Fibonacci {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int res=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=2; i<n; i++) {
			res=n1+n2;
			n1=n2;
			n2=res;
			System.out.print(res+" ");
		}
		sc.close();
	}

}
