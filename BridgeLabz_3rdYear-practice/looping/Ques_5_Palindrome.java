package looping;

import java.util.Scanner;

public class Ques_5_Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int digit=0;
		while(temp>0) {
			int rem=temp%10;
			digit=rem+digit*10;
			temp/=10;
		}
		if(n==digit) {
			System.out.println("yes, palindrome");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}
}
