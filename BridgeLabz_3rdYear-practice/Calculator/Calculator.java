package calculator;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opt=0;
        while(true){
            System.out.println("! Welcome !");
            System.out.println("1. Basic Operations");
            System.out.println("2. Exit");
            System.out.print("Choose an Option: ");
            try{
                opt= sc.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid Input, Please enter a number");
                sc.next();
                continue;
            }

            switch (opt){
                case 1:
                    basic(sc);
                    break;
                case 2:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("!!! Invalid Choice !!!, Please try again");
            }
        }
    }

    public static void basic(Scanner sc) {
        System.out.println("\nBasic Operations");
        System.out.println("Choose Operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int cnt=0;
        while(true) {
            System.out.print("Enter the number of values to operate on: ");
            try {
                cnt = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, Please enter a valid number");
                sc.next();
            }
        }
        double []nums= new double[cnt];
        for(int i=0; i<cnt; i++){
            while (true) {
                System.out.print("Enter number " + (i + 1) + " : ");
                try {
                    nums[i] = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input! Please enter a valid number");
                    sc.next();
                }
            }
        }
        int opr=0;
        while (true) {
            System.out.println("Choose Operations (1-4): ");
            try {
                opr = sc.nextInt();
                if (opr == 0) {
                    return;
                }
                if (opr<0 || opr>4){
                    System.out.println("Invalid Input! Please choose operation between 1 to 4");
                }
                else{
                    break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid Input, Please enter a Valid number");
                sc.next();
            }
        }
        double res=nums[0];
        switch (opr){
            case 1:
                for (int i=1; i<cnt; i++){
                    res+=nums[i];
                }
                System.out.println("Result: "+res);
                break;
            case 2:
                for(int i=1; i<cnt; i++){
                    res-=nums[i];
                }
                System.out.println("Result: "+res);
                break;
            case 3:
                for(int i=1; i<cnt; i++){
                    res*=nums[i];
                }
                System.out.println("Result: "+res);
                break;
            case 4:
                for(int i=1; i<cnt; i++){
                    if(nums[i]!=0){
                        res/=nums[i];
                    }
                    else{
                        System.out.println("Error Division! Divide by Zero");
                        return;
                    }
                }
                System.out.println("Result: "+res);
                break;
        }
    }

}
