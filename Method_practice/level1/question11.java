import java.util.Scanner;

public class TrigonometricFunctions {
    public static void calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        System.out.println("sin(" + angle + ") = " + sin);
        System.out.println("cos(" + angle + ") = " + cos);
        System.out.println("tan(" + angle + ") = " + tan);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        calculateTrigonometricFunctions(angle);
        sc.close();
    }
}
