package practiceProblems;
import java.util.*;
public class Self_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1 : Simple Interest
        System.out.print("Enter a Principal Amount :");
        int prin = sc.nextInt();
        System.out.print("Enter a Rate :");
        int rat = sc.nextInt();
        System.out.print("Enter a Time :");
        double time = sc.nextDouble();
        double SI = (prin * rat * time) / 100; 
        System.out.println("Simple Interest : " + SI);

        //Question 2 : Perimeter of a Rectangle
        System.out.print("Enter a Length of Rectangle :");
        int len = sc.nextInt();
        System.out.print("Enter a Width of Rectangle :");
        int wid = sc.nextInt();
        int Perimeter = 2 * (len + wid);
        System.out.println("Perimeter of a Rectangle : " + Perimeter);

        //Question 3 : Power Calculation
        System.out.print("Enter a Base Number :");
        int a = sc.nextInt();
        System.out.print("Enter a Exponent Number : ");
        int b = sc.nextInt();
        System.out.println(Math.pow(a, b));

        //Question 4 : Average of Three Numbers
        System.out.print("Enter a First Number :");
        int a1 = sc.nextInt();
        System.out.print("Enter a Second Number : ");
        int b1 = sc.nextInt();
        System.out.print("Enter a Third Number :");
        int c1 = sc.nextInt();
        System.out.println("Output : "+(a1+b1+c1)/3);

        //Question 5 : Kilometers to Miles
        System.out.print("Enter a Kilometer Number :");
        int kilo = sc.nextInt();
        System.out.println("Miles : "+kilo * 0.621371);
        sc.close();
    }
}
