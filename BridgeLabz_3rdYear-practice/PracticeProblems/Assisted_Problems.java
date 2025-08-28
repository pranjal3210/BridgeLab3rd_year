package practiceProblems;
import java.util.*;
public class Assisted_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Question 1 : Welcome to Bridgelabz!
        System.out.println("Welcome to Bridgelabz!");

        //Question 2 : Add Two Numbers
        System.out.print("Enter a First Number :");
        int a = sc.nextInt();
        System.out.print("Enter a Second Number : ");
        int b = sc.nextInt();
        System.out.println("Output : " + (a+b));

        //Question 3 : Celsius to Fahrenheit Conversion
        System.out.print("Enter a Temperature in Celsius :");
        int cel = sc.nextInt();
        int feh = (cel * 9/5) + 32;
        System.out.println("Output : " + feh);

        //Question 4 : Area of a Circle
        System.out.print("Enter a Radius of Circle :");
        int rad = sc.nextInt();
        double area = Math.PI*rad*rad;
        System.out.println("Output : " + area);

        //Question 5 : Volume of a Cylinder
        System.out.print("Enter a Radius of Circle :");
        int radius = sc.nextInt();
        System.out.println("Enter a height of a Cylinder :");
        int height = sc.nextInt();
        double volume = Math.PI*radius*radius*height;
        System.out.println("Output : " + volume);
        sc.close();
    }
}
